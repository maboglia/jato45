package com.bogliaccino.canzoni.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bogliaccino.canzoni.services.CantanteService;
import com.bogliaccino.canzoni.services.CanzoniService;

@Controller
@RequestMapping
public class CanzoniCtrl {

	@Autowired
	private CantanteService serviceCantanti;

	@Autowired
	private CanzoniService serviceCanzoni;
	
	@GetMapping("cantanti")
	public String getCantanti(Model model) {
		
		model.addAttribute("titolo", "cantanti");
		model.addAttribute("cantanti", serviceCantanti.getCantanti());
		
		return "cantanti";
	}
	
	
	@GetMapping("canzoni")
	public String getCanzoni(Model model) {
		
		model.addAttribute("titolo", "canzoni");
		model.addAttribute("canzoni", serviceCanzoni.getCanzoni());
		
		return "canzoni";
	}	
}
