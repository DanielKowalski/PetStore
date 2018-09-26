package me.daniel.tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.daniel.models.Food;

public class FoodTest {
	
	@Test
	void testCreateFood() {
		Food nullFood = new Food();
		assertNull(nullFood.getBrandName());
		assertEquals(0, nullFood.getFoodPoints());
		assertEquals(0, nullFood.getId());
		assertNull(nullFood.getName());
		assertEquals(0, nullFood.getPrice());
		assertEquals("01/01/1970", nullFood.getUseByDate());
		
		Food bone = new Food(0, "Kość", "Kości i spółka", 1.51f, 1, 
				"18/02/2019");
		
		assertEquals("Kość", bone.getName());
		assertEquals(0, bone.getId());
		assertEquals("Kości i spółka", bone.getBrandName());
		assertEquals(1.51f, bone.getPrice());
		assertEquals(1, bone.getFoodPoints());
		assertEquals("18/02/2019", bone.getUseByDate());
	}
	
	@Test
	void testFoodToString() {
		Food meat = new Food(1, "mięsko", "Animex", 5.43f, 4, "12/2/2020");
		
		assertEquals("Food [id=1, name=mięsko, brandName=Animex, price=5.43, "
				+ "foodPoints=4, useByDate=12/02/2020]", meat.toString());
	}
}
