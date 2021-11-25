package com.bogliaccino.alimenti.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bogliaccino.alimenti.entities.Alimento;
import com.bogliaccino.alimenti.services.AlimentoService;

@Controller
@RequestMapping("")
public class Alimenti {

	@Autowired
	private AlimentoService service;
	
	@GetMapping("")
	public String getAll(Model model) {
		List<Alimento> alimenti = service.getAll();
		model.addAttribute("alimenti", alimenti);
		model.addAttribute("titolo", "Elenco di alimenti");
		return "elenco_alimenti.html";
	}
	
}
