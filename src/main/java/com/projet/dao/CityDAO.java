package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.projet.model.City;

public class CityDAO implements ICityDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<City> recupererListeVilles() {
		
		Session session=sessionFactory.getCurrentSession();
		
		List<City> listCity=session.createQuery("from City").list();
		
		return listCity;
	}
}