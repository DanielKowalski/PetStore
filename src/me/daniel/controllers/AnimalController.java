package me.daniel.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import me.daniel.models.Animal;

@Controller
public class AnimalController {

	@GetMapping("/animalForm")
	public String animalForm(ModelMap model) {
		model.addAttribute("title", "Dodaj nowe zwierzę");
		model.addAttribute("animal", new Animal());
		return "animalForm";
	}
	
	@PostMapping("/newAnimal")
	public String newAnimal(@Valid @ModelAttribute("animal") Animal animal, 
			BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			ArrayList<String> errorsList = new ArrayList<String>();
			for(FieldError error : 
				result.getFieldErrors()) {
				errorsList.add(error.getObjectName() + ": " + error.getField() 
					+ ": " + error.getDefaultMessage());
			}
			model.addAttribute("errorsList", errorsList);
			model.addAttribute("title", "Wystąpiły następujące błędy!!!");
			return "error";
		}
		model.addAttribute("title", "Nowe zwierze zostało dodane pomyślnie!");
		model.addAttribute("name", animal.getName());
		model.addAttribute("sound", animal.getSound());
		model.addAttribute("id", animal.getId());
		return "newAnimal";
	}
}
