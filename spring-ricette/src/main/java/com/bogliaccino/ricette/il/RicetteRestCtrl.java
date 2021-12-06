package com.bogliaccino.ricette.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bogliaccino.ricette.entities.Ricetta;
import com.bogliaccino.ricette.sl.RicetteService;

@RestController
@RequestMapping("api")
public class RicetteRestCtrl {

	@Autowired
	private RicetteService servizio;
	
	@GetMapping
	public List<Ricetta> trovaTutti(){
		return this.servizio.getAll();
	}
	
	
}
