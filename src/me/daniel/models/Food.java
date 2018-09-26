package me.daniel.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	
	
	public Food() { }
	
	public Food(long id, String name, String brandName, float price, 
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
	 * Date handling 
	 */
	
	public void setUseByDate(String useByDate) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.useByDate = format.parse(useByDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String getUseByDate() {
		Calendar calendar = Calendar.getInstance();
		String useByDate = "01/01/1970"; // Set default date
		if(this.useByDate != null) {
			calendar.setTime(this.useByDate);
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			int month = calendar.get(Calendar.MONTH) + 1;
			int year = calendar.get(Calendar.YEAR);
			useByDate = (day < 10 ? "0" + day : day) + "/" 
				+ (month < 10 ? "0" + month : month) + "/" 
				+ year;
		}
		return useByDate;
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
}
