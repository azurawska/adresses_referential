package com.projet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springweb/index")
public class RetourController {
	
	public String afficherBievenu(ModelMap map) {
		return "index";
	}
}