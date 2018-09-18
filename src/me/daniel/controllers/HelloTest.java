package me.daniel.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HelloTest {

	private static HelloController controller;
	
	@BeforeAll
	static void prepareHelloController() {
		controller = new HelloController();
	}
	
	@Test
	void testRemoveNotLettersFromString() {
		assertEquals(controller.removeNotLettersFrom("a!l#a!@"), "ala");
		assertEquals(controller.removeNotLettersFrom("1234a567l890a"), "ala");
		assertEquals(controller.removeNotLettersFrom("12??/'~al#`ą"), "alą");
		assertEquals(controller.removeNotLettersFrom("A%$@l\"\'\\::a"), "Ala");
	}
	
}
