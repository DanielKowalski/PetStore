package me.daniel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import me.daniel.services.StringChanger;

@Controller
public class HelloController {
	@Autowired
	private StringChanger nameChanger;
	
	@GetMapping("/")
	public String hello(ModelMap model) {
		model.addAttribute("greetings", "Witaj drogi kliencie!");
		return "hello";
	}
	
	@GetMapping("/{name}")
	public String helloName(@PathVariable String name, ModelMap model) {
		model.addAttribute("greetings", "Witaj " + nameChanger.prepareName(name)
			+ "!");
		return "hello";
	}
	
	@GetMapping("/bye")
	public String bye(ModelMap model) {
		model.addAttribute("greetings", "Żegnaj drogi kliencie!");
		return "hello";
	}
	
	@GetMapping("/bye:{name}")
	public String byeName(@PathVariable String name, ModelMap model) {
		model.addAttribute("greetings", "Żegnaj "
			+ nameChanger.prepareName(name) + "!");
		return "hello";
	}
}
