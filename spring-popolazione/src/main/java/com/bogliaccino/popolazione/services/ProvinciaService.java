package com.bogliaccino.popolazione.services;

import java.util.List;

import com.bogliaccino.popolazione.entities.Provincia;

public interface ProvinciaService {

	void addProvincia(Provincia p);
	Provincia getProvincia(int id);
	List<Provincia> getAll();
	List<Provincia> getByRegione(String regione);
	
	List<Provincia> getProvince();
	void initProvince();
}
