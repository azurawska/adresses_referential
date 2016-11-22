package com.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projet.dao.IAreaDAO;
import com.projet.model.Area;

@Service
public class AreaService implements IAreaService {
	
	@Autowired
	private IAreaDAO areaDAO;

	public IAreaDAO getAreaDAO() {
		return areaDAO;
	}

	public void setAreaDAO(IAreaDAO areaDAO) {
		this.areaDAO = areaDAO;
	}
	
	@Transactional(readOnly=true)
	public List<Area> recupererListeRegions() {
		
		List<Area> listArea = areaDAO.recupererListeRegions();
		return listArea;
	}
}