package com.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.IStreetDAO;
import com.projet.model.Street;

@Service
public class StreetService implements IStreetService {
	
	@Autowired
	private IStreetDAO streetDAO;

	public IStreetDAO getStreetDAO() {
		return streetDAO;
	}

	public void setStreetDAO(IStreetDAO streetDAO) {
		this.streetDAO = streetDAO;
	}

	@Transactional(readOnly=true)
	public List<Street> recupererListeRuesSaintDenis() {
		
		List<Street> listStreet=streetDAO.recupererListeRuesSaintDenis();
		
		return listStreet;
	}
}