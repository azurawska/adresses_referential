package com.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projet.model.Language;
import com.projet.service.ILanguageService;

@Controller
@RequestMapping("/language")
public class LanguageController {
	
	private ILanguageService languageService;

	public ILanguageService getLanguageService() {
		return languageService;
	}

	@Autowired(required=true)
	@Qualifier(value="languageService")
	public void setLanguageService(ILanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String recupererListeLangages(ModelMap map) {
		List<Language> listeLangages = languageService.recupererListeLangages();
		map.addAttribute("listLanguage", listeLangages);
		return "pageLangages";
	}
}