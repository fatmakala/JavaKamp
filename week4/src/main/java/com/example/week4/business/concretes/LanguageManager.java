package com.example.week4.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.week4.business.abstracts.LanguageService;
import com.example.week4.dataAccess.abstracts.LanguageRepository;
import com.example.week4.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() 
	{
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) 
	{
		return languageRepository.getById(id);
	}

	@Override
	public void create(Language language) throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("İsim boş geçilemez.");
		}
		for(Language language2:getAll()) {
			if(language2.getId()== language.getId()) {
				throw new Exception("Programlama isimleri tekrar edilemez");
			}
		}
		languageRepository.create(language);
	}

	@Override
	public void update(Language language)
	{
		languageRepository.update(language);
		
	}

	@Override
	public void delete(int id)
	{
		languageRepository.delete(id);
		
	}

}
