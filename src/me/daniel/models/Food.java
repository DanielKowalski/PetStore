package me.daniel.models;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Food {

	@NotNull
	private int id;
	
	@NotNull
	@Size(min = 5, max = 32)
	private String name;
	
	@Size(min = 2, max = 32)
	private String brandName;
	
	@NotNull
	@Digits(integer = 6, fraction = 2)
	private float price;
	
	@NotNull
	@Min(1)
	@Max(10)
	private int foodPoints;
	
	@NotNull
	@Pattern(regexp = "([1-9]|[12][0-9]|3[01])\\/([1-9]|1[0-2])\\/\\d{4}", 
		message = "Give date in format dd/MM/yyyy")
	private String useByDate;
	
	public Food() { }
	
	public Food(int id, String name, String brandName, float price, 
			int foodPoints, String useByDate) {
		setId(id);
		setName(name);
		setBrandName(brandName);
		setPrice(price);
		setFoodPoints(foodPoints);
		setUseByDate(useByDate);
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", brandName=" + brandName 
				+ ", price=" + price + ", foodPoints=" + foodPoints 
				+ ", useByDate=" + useByDate + "]";
	}
	
	/*
	 * Getters and setters
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getFoodPoints() {
		return foodPoints;
	}

	public void setFoodPoints(int foodPoints) {
		this.foodPoints = foodPoints;
	}
	
	public String getUseByDate() {
		return useByDate;
	}
	
	public void setUseByDate(String useByDate) {
		this.useByDate = useByDate;
	}
}
