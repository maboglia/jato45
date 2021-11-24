package com.bogliaccino.springlibreria01.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.bogliaccino.springlibreria01.model.Libro;

@Service
public class LibroServiceImpl implements LibroService {

	ArrayList<Libro> repo;
	//qui devo farmi dare i dati del repo dal DAO

	{
		repo = new ArrayList<Libro>();
		repo.add(new Libro(1, "Io, robot", 10));
		repo.add(new Libro(2, "I malavoglia", 11));
		repo.add(new Libro(3, "Guerra e pace", 12));
		repo.add(new Libro(4, "I promossi spesi", 13));
		repo.add(new Libro(5, "Marcovaldo", 14));
				
	}
	
	
	
	
	
	@Override
	public ArrayList<Libro> getLibri() {
		// TODO Auto-generated method stub
		return this.repo;
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return this.repo.get(id);
	}

	@Override
	public void addLibro(Libro l) {
		this.repo.add(l);
		System.out.println("libro aggiunto");

	}

}
