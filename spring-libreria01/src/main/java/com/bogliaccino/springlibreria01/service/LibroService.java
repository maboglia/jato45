package com.bogliaccino.springlibreria01.service;

import java.util.ArrayList;

import com.bogliaccino.springlibreria01.model.Libro;

public interface LibroService {

	//implicitamente public abstract
	ArrayList<Libro> getLibri();
	Libro getLibroById(int id);
	void addLibro(Libro l);
	
}
