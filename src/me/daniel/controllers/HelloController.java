package me.daniel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.daniel.services.StringChanger;

@Controller
public class HelloController {
	@Autowired
	private StringChanger nameChanger;
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("greetings", "Witaj drogi kliencie!");
		return "helloView";
	}
	
	@RequestMapping(path = "/{name}", method = RequestMethod.GET)
	public String helloName(@PathVariable String name, ModelMap model) {
		model.addAttribute("greetings", "Witaj " + nameChanger.prepareName(name) + "!");
		return "helloView";
	}
	
	@RequestMapping(path = "/bye", method = RequestMethod.GET)
	public String bye(ModelMap model) {
		model.addAttribute("greetings", "Żegnaj drogi kliencie!");
		return "helloView";
	}
	
	@RequestMapping(path = "/bye:{name}", method = RequestMethod.GET)
	public String byeName(@PathVariable String name, ModelMap model) {
		model.addAttribute("greetings", "Żegnaj " + nameChanger.prepareName(name) + "!");
		return "helloView";
	}
}
