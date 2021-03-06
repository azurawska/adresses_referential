package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.projet.model.Language;

public class LanguageDAO implements ILanguageDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Language> recupererListeLangages() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Language> listLanguage = session.createQuery("from Language").list();
	
		return listLanguage;
	}
}