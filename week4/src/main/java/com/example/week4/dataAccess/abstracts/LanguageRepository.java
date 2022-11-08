package com.example.week4.dataAccess.abstracts;

import java.util.List;



import com.example.week4.entities.concretes.Language;


public interface LanguageRepository {
	List<Language> getAll();
	Language getById(int id) ;
	void create(Language language) ;
	void update(Language language ) ;
	void delete(int id);
	

}
