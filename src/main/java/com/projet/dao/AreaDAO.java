package com.projet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.projet.model.Area;

public class AreaDAO implements IAreaDAO {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Area> recupererListeRegions() {
		
		Session session = sessionFactory.getCurrentSession();
		
		List<Area> listArea = session.createQuery("from Area").list();
	
		return listArea;
	}
}