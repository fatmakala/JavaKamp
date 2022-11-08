package com.example.week4.business.abstracts;

import java.util.List;

import com.example.week4.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language getById(int id) ;
	void create(Language language) throws Exception ;
	void update(Language language ) ;
	void delete(int id);
	

}
