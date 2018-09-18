package me.daniel.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import me.daniel.services.StringChanger;

public class StringChangerTest {
	
	private static StringChanger stringChanger;
	
	@BeforeAll
	static void prepareVariable() {
		stringChanger = new StringChanger();
	}
	
	@Test
	void testRemoveNotLettersFromString() {
		
	}

}
