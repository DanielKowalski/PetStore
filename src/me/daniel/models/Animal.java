package me.daniel.models;

import java.util.ArrayList;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Animal {
	
	@NotNull
	@Size(min = 2, max = 30)
	private String name;
	
	@NotNull
	private Long id;
	
	@NotNull
	@Size(min = 1, max = 10)
	private String sound;

	private ArrayList<Food> likedFoods;
	private ArrayList<Food> unlikedFoods;
	
	public Animal() {
		initFoodsLists();
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", id=" + id + ", sound=" + sound 
				+ ", likedFoods=" + likedFoods
				+ ", unlikedFoods=" + unlikedFoods + "]";
	}

	/*
	 * Operations on foodsLists
	 */
	
	public void addLikedFood(Food food) {
		likedFoods.add(food);
	}
	
	public void addUnlikedFood(Food food) {
		unlikedFoods.add(food);
	}
	
	public void removeLikedFood(Food food) {
		likedFoods.remove(food);
	}
	
	public void removeUnlikedFood(Food food) {
		unlikedFoods.remove(food);
	}

	public Food getLikedFood(int index) {
		return likedFoods.get(index);
	}
	
	public Food getUnlikedFood(int index) {
		return unlikedFoods.get(index);
	}
	
	public ArrayList<Food> getLikedFoods() {
		return likedFoods;
	}
	
	public ArrayList<Food> getUnlikedFoods() {
		return unlikedFoods;
	}
	
	private void initFoodsLists() {
		likedFoods = new ArrayList<Food>();
		unlikedFoods = new ArrayList<Food>();
	}
	
	/*
	 * Getters and setters
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
}
