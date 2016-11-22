package com.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.ILanguageDAO;
import com.projet.model.Language;

@Service
public class LanguageService implements ILanguageService {
	
	@Autowired
	private ILanguageDAO languageDAO;

	public ILanguageDAO getLanguageDAO() {
		return languageDAO;
	}

	public void setLanguageDAO(ILanguageDAO languageDAO) {
		this.languageDAO = languageDAO;
	}
	
	@Transactional(readOnly=true)
	public List<Language> recupererListeLangages() {
		
		List<Language> listLanguage = languageDAO.recupererListeLangages();
		return listLanguage;
	}
}