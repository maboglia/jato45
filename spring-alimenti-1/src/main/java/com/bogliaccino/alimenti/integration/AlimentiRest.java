package com.bogliaccino.alimenti.integration;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bogliaccino.alimenti.entities.Alimento;
import com.bogliaccino.alimenti.service.AlimentoService;

@RestController
@RequestMapping("/api")
public class AlimentiRest {

	@Autowired
	private AlimentoService service;
	
	@GetMapping
	@CrossOrigin
	public List<Alimento> getAll(){
		return this.service.getAlimenti();
	}

	@GetMapping("/ordina/energia")
	@CrossOrigin
	public List<Alimento> getAllByEnergia(){
		List<Alimento> alimenti = this.service.getAlimenti();
		Collections.sort(alimenti, (a1, a2) -> a1.getEnergia()-a2.getEnergia());
		
		return alimenti;
	}
		
	
	@CrossOrigin
	@GetMapping("/{id}")
	public Alimento getOne(@PathVariable("id") int id) {
		return this.service.getAlimento(id);
	}
	
	
}
