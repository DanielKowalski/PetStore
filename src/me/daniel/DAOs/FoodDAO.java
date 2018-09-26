package me.daniel.DAOs;

import java.util.List;

import me.daniel.models.Food;

public interface FoodDAO {

	public void saveOrUpdate(Food food);
	
	public void delete(int food_id);
	
	public Food get(int food_id);
	
	public List<Food> list();
}
