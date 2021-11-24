package com.bogliaccino.springlibreria01.service;

import java.util.ArrayList;
import java.util.List;

import com.bogliaccino.springlibreria01.model.Libro;

public interface LibroService {

	//implicitamente public abstract
	List<Libro> getLibri();
	Libro getLibroById(int id);
	void addLibro(Libro l);
	
}
