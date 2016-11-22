package com.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.ICityDAO;
import com.projet.model.City;

@Service
public class CityService implements ICityService {
	
	@Autowired
	private ICityDAO cityDAO;

	public ICityDAO getCityService() {
		return cityDAO;
	}

	public void setCityDAO(ICityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	@Transactional(readOnly=true)
	public List<City> recupererListeVilles() {
		
		List<City> listCity=cityDAO.recupererListeVilles();
		return listCity;
	}
}