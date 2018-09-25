package me.daniel.models;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Food {

	@NotNull
	private long id;
	
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
	private Date useByDate;
	
	
	public Food() {}
	
	public Food(long id, String name, String brandName, float price, 
			int foodPoints, Date useByDate) {
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public Date getUseByDate() {
		return useByDate;
	}

	public void setUseByDate(Date useByDate) {
		this.useByDate = useByDate;
	}
}
