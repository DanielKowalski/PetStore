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
		assertEquals("ala", stringChanger.removeNotLettersFrom("ala"));
		assertEquals("ala", stringChanger.removeNotLettersFrom("a!l%%a123"));
		assertEquals("ala", stringChanger.removeNotLettersFrom("'a!@#la;!@@"));
		assertEquals("ala", stringChanger.removeNotLettersFrom("a3/21123214l12312a"));
		assertEquals("Ala", stringChanger.removeNotLettersFrom("Al--=-3234a12"));
		assertEquals("Ala", stringChanger.removeNotLettersFrom("Al234234a234234:::12312"));
	}

}
