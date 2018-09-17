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
		StringBuilder builder = new StringBuilder(name.toLowerCase());
		builder.setCharAt(0, Character.toUpperCase(builder.charAt(0)));
		name = builder.toString();
		model.addAttribute("greetings", "Witaj " + name + "!");
		return "hello";
	}
	
}
