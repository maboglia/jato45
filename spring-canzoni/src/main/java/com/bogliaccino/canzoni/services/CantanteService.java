package com.bogliaccino.canzoni.services;

import java.util.List;

import com.bogliaccino.canzoni.entities.Cantante;

public interface CantanteService {

	Cantante getCantante(int id);
	List<Cantante> getCantanti();

	void addCantante(Cantante c);
	void updCantante(Cantante c);
	void delCantante(int id);
	
}
