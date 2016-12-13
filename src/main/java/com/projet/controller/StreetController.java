package com.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.Street;
import com.projet.service.IStreetService;

@Controller
@RequestMapping("/street")
public class StreetController {
	
	private IStreetService streetService;

	public IStreetService getStreetService() {
		return streetService;
	}

	@Autowired(required=true)
	@Qualifier(value="streetService")
	public void setStreetService(IStreetService streetService) {
		this.streetService = streetService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String recupererListeRuesSaintDenis(ModelMap map) {
		
		List<Street> listeRuesSaintDenis = streetService.recupererListeRuesSaintDenis();
		map.addAttribute("listStreet", listeRuesSaintDenis);
		return "pageRuesSaintDenis";
	}
}