package com.bogliaccino.ricette.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public ResponseEntity<Ricetta> addRicetta(@RequestBody Ricetta r) {
		this.servizio.addRicetta(r);
		return new ResponseEntity<Ricetta>(r, HttpStatus.CREATED);
	}
	
}
