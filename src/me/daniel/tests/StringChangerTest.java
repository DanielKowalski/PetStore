package me.daniel.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import me.daniel.services.StringChanger;

public class StringChangerTest {
	
	private static StringChanger stringChanger;
	
	/*
	 * TODO Dodać resztę testów
	 */
	
	@BeforeAll
	static void prepareVariable() {
		stringChanger = new StringChanger();
	}
	
	@Test
	void testRemoveNotLettersFromString() {
		/*
		 * TODO Dodaj więcej przypadków do sprawdzenia
		 */
		assertEquals("ala", stringChanger.removeNotLettersFrom("ala"));
		assertEquals("ala", stringChanger.removeNotLettersFrom("a!l%%a"));
		assertEquals("ala", stringChanger.removeNotLettersFrom("'a!@#la;!@@"));
	}

}
