package me.daniel.DAOs;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import me.daniel.models.Food;

public class FoodDAOImpl implements FoodDAO {
	private JdbcTemplate jdbcTemplate;
	
	public FoodDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void saveOrUpdate(Food food) {
		
	}

	@Override
	public void delete(int food_id) {

	}

	@Override
	public Food get(int food_id) {
		return null;
	}

	@Override
	public List<Food> list() {
		return null;
	}
}
