package me.daniel.DAOs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import me.daniel.models.Food;
import me.daniel.models.NullFood;

@ComponentScan("me.daniel")
public class FoodDAOImpl implements FoodDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveOrUpdate(Food food) {
		if (food.getId() > 0) {
			String sqlStatement = "UPDATE food SET name=?, brandName=?, "
					+ "price=?, foodPoints=?, useByDate=? WHERE id=?";
			jdbcTemplate.update(sqlStatement, food.getName(),
					food.getBrandName(), food.getPrice(), food.getFoodPoints(),
					food.getUseByDate(), food.getId());
		}
		else {
			String sqlStatement = "INSERT INTO food (name, brandName, price, "
					+ "foodPoints, useByDate) VALUES (?, ?, ?, ?, ?)";
			jdbcTemplate.update(sqlStatement, food.getName(), 
					food.getBrandName(), food.getPrice(), food.getFoodPoints(),
					food.getUseByDate());
		}
	}

	@Override
	public void delete(int foodId) {
		String sqlStatement = "DELETE FROM food WHERE id = ?";
		jdbcTemplate.update(sqlStatement, foodId);
	}

	@Override
	public Food get(int foodId) {
		String sqlStatement = "SELECT * FROM food WHERE id = " + foodId;
		return jdbcTemplate.query(sqlStatement, new ResultSetExtractor<Food>() {

			@Override
			public Food extractData(ResultSet resultSet) throws SQLException, 
					DataAccessException {
				if (resultSet.next()) {
					Food food = new Food();
					food.setId(resultSet.getLong("id"));
					food.setName(resultSet.getString("name"));
					food.setBrandName(resultSet.getString("brandName"));
					food.setPrice(resultSet.getFloat("price"));
					food.setFoodPoints(resultSet.getInt("foodPoints"));
					food.setUseByDate(resultSet.getString("useByDate"));
					
					return food;
				}
				
				return new NullFood();
			}
			
		});
	}

	@Override
	public List<Food> list() {
		return null;
	}
}
