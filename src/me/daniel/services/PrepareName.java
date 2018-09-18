package me.daniel.services;

import org.springframework.stereotype.Service;

@Service
public class PrepareName {
	
	public String prepareName(String name) {
		//TODO Dodać obsługę nazwisk
		name = removeNotLettersFrom(name);
		name = capitalize(name);
		return name;
	}
	
	public String capitalize(String name) {
		StringBuilder builder = new StringBuilder(name.toLowerCase());
		builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
		return builder.toString();
	}

	public String removeNotLettersFrom(String name) {
		StringBuilder builder = new StringBuilder(name);
		for(int i = 0; i < builder.length(); i++) {
			if (!Character.isLetter(builder.charAt(i))) {
				builder = builder.deleteCharAt(i);
				i--;
			}
		}
		return builder.toString();
	}
	
}
