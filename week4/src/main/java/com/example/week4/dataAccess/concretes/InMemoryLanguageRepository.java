package com.example.week4.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.week4.dataAccess.abstracts.LanguageRepository;
import com.example.week4.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
	
	List<Language> languages;
	

	public InMemoryLanguageRepository() {
		
		languages = new ArrayList<Language>();
		
		languages.add(new Language("Java",1));
		languages.add(new Language("Python",2));
		languages.add(new Language("C",3));
		languages.add(new Language("C#",4));
		languages.add(new Language("Kotlin",5));
	}

	@Override
	public List<Language> getAll()
	{
		return languages;
	}

	@Override
	public Language getById(int id) 
	{
		for(Language language : languages) {
			if(language.getId()==id) {
				return language;
			}
		}
		return null;
	}


	@Override
	public void create(Language language) 
	{
		languages.add(language);	
	}

	@Override
	public void update(Language language) 
	{
		for(Language language1 :languages) {
			if(language1.getId()==language1.getId()) {
				language1.setId((language1.getId()));
				language1.setName((language1.getName()));
			}
	
		}
	}

	@Override
	public void delete(int id) 
	{
		for (Language language: languages) {
			if(language.getId()==id) {
				languages.remove(id);
			}
		}
		
	}

}
