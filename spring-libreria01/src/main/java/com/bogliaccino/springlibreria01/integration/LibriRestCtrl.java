package com.bogliaccino.springlibreria01.integration;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bogliaccino.springlibreria01.model.Libro;
import com.bogliaccino.springlibreria01.service.LibroService;

@RestController
@RequestMapping("/api/libri")
public class LibriRestCtrl {

	//binding - collegamento col service
	//IOC - Inversion of control - DI dependency injection
	@Autowired
	private LibroService service;
	
	@GetMapping("")
	public ArrayList<Libro> getLibri(){
		return service.getLibri();
	}
	
	@GetMapping("/{id}")
	public Libro getLibroById(@PathVariable("id") int id) {
		return this.service.getLibroById(id);
	}
	
}
