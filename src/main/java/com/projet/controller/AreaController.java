package com.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.Area;
import com.projet.service.IAreaService;

@Controller
@RequestMapping("/area")
public class AreaController {
	
	private IAreaService areaService;

	public IAreaService getAreaService() {
		return areaService;
	}
	
	@Autowired(required=true)
	@Qualifier(value="areaService")
	public void setAreaService(IAreaService areaService) {
		this.areaService = areaService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String recupererListeRegions(ModelMap map) {
		List<Area> listeRegions = areaService.recupererListeRegions();
		map.addAttribute("listArea", listeRegions);
		return "pageRegions";
	}
}