package me.daniel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {

	@GetMapping("/animalForm")
	public String animalForm(ModelMap model) {
		model.addAttribute("title", "Dodaj nowe zwierzę");
		return "animalForm";
	}
	
}
