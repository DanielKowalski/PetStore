package me.daniel.tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import me.daniel.models.Food;

public class FoodTest {
	static private SimpleDateFormat format;
	
	@BeforeAll
	static void prepareSimpleDateFormat() {
		format = new SimpleDateFormat("dd/MM/yyyy");
	}
	
	@Test
	void testCreateFood() throws ParseException {
		Food nullFood = new Food();
		assertNull(nullFood.getBrandName());
		assertEquals(0, nullFood.getFoodPoints());
		assertEquals(0, nullFood.getId());
		assertNull(nullFood.getName());
		assertEquals(0, nullFood.getPrice());
		assertNull(nullFood.getUseByDate());
		
		Food bone = new Food(0, "Kość", "Kości i spółka", 1.51f, 1, 
				format.parse("18/12/2019"));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(bone.getUseByDate());
		String date = calendar.get(Calendar.DAY_OF_MONTH) + "/" 
				+ (calendar.get(Calendar.MONTH) + 1) + "/" 
				+ calendar.get(Calendar.YEAR); 
		
		assertEquals("Kość", bone.getName());
		assertEquals(0, bone.getId());
		assertEquals("Kości i spółka", bone.getBrandName());
		assertEquals(1.51f, bone.getPrice());
		assertEquals(1, bone.getFoodPoints());
		assertEquals("18/12/2019", date);
	}
}
