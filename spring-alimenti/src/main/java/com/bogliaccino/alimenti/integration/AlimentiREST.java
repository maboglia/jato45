package com.bogliaccino.alimenti.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bogliaccino.alimenti.entities.Alimento;
import com.bogliaccino.alimenti.services.AlimentoService;

@RestController
@RequestMapping("/api/alimenti")
public class AlimentiREST {

	@Autowired
	private AlimentoService servizio;
	
	@GetMapping("")
	public List<Alimento> trovaTutti(){
		return servizio.getAll();
	}
	
	
}
