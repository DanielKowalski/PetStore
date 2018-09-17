package me.daniel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("greetings", "Witaj drogi kliencie!");
		return "hello";
	}
	
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public String helloName(@PathVariable String name, ModelMap model) {
		model.addAttribute("greetings", "Witaj " + prepareName(name) + "!");
		return "hello";
	}
	
	@RequestMapping(path = "/bye", method = RequestMethod.GET)
	public String bye(ModelMap model) {
		model.addAttribute("greetings", "Żegnaj drogi kliencie!");
		return "hello";
	}
	
	@RequestMapping(path = "/bye:{name}", method = RequestMethod.GET)
	public String byeName(@PathVariable String name, ModelMap model) {
		model.addAttribute("greetings", "Żegnaj " + prepareName(name) + "!");
		return "hello";
	}

	private String prepareName(String name) {
		//TODO Dodać obsługę nazwisk
		name = removeNotLettersFrom(name);
		StringBuilder builder = new StringBuilder(name.toLowerCase());
		builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
		return builder.toString();
	}

	private String removeNotLettersFrom(String name) {
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
