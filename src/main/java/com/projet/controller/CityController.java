package com.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.City;
import com.projet.service.ICityService;

@Controller
@RequestMapping("/city")
public class CityController {
	
	private ICityService cityService;

	public ICityService getCityService() {
		return cityService;
	}

	@Autowired(required=true)
	@Qualifier(value="cityService")
	public void setCityService(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String recupererListeVilles(ModelMap map) {
		List<City> listeVilles=cityService.recupererListeVilles();
		map.addAttribute("listCity", listeVilles);
		return "pageVilles";
	}
}