package com.bogliaccino.springlibreria01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.springlibreria01.model.Libro;
import com.bogliaccino.springlibreria01.repos.LibroDAO;



@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO repo;
	
	@Override
	public List<Libro> getLibri() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();
	}

	@Override
	public void addLibro(Libro l) {
		this.repo.save(l);
		System.out.println("libro aggiunto");

	}

}
