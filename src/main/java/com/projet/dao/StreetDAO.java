package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.projet.model.Street;

public class StreetDAO implements IStreetDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Street> recupererListeRuesSaintDenis() {
		
		Session session=sessionFactory.getCurrentSession();
		
		List<Street> listStreet=session.createQuery("from Street").list();
		
		return listStreet;
	}
}