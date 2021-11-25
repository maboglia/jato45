package com.bogliaccino.alimenti.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{indice}")
	public Alimento getOne(@PathVariable("indice") int id) {
		System.out.println(servizio.getAlimentoById(id));
		if (!servizio.getAlimentoById(id).isEmpty())
			return servizio.getAlimentoById(id).get();
		else
			return servizio.getAlimentoById(1).get();
	}
	
	@PostMapping(value = "", consumes = "application/json")
	public void addAlimento(@RequestBody Alimento a) {
		servizio.addAlimento(a);
	}
	
	@PutMapping(value = "", consumes = "application/json")
	public Alimento updAlimento(@RequestBody Alimento a) {
		return servizio.updAlimento(a);
	}
	
	@DeleteMapping("/{indice}")
	public String deleteAlimento(@PathVariable("indice") int id) {
		servizio.deleteAlimentoById(id);
		return "{\"result\": \"TUTTO OK: record eliminato!\"}";
	}
	
}
