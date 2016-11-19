package com.projet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bienvenu")
public class BienvenuController {
	
	public String afficherBievenu(ModelMap map) {
		map.addAttribute("personne", "Toto");
		return "bienvenu";
	}
}