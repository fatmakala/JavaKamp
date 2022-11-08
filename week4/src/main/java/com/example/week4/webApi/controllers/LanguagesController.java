package com.example.week4.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.week4.business.abstracts.LanguageService;
import com.example.week4.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getAll")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@PostMapping("/add")
	public void create(Language language) throws Exception {
		languageService.create(language);
	}
	@PutMapping("/update")
	public void update(Language language) {
		languageService.update(language);
	}
	@DeleteMapping("/delete")
	public void delete(int id)  {
		languageService.delete(id);;
	}
	@GetMapping("/{id}")
	public Language getById(int id) {
		return languageService.getById(id);
	}
}
