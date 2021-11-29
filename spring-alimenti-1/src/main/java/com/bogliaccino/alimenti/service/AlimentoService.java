package com.bogliaccino.alimenti.service;

import java.util.List;

import com.bogliaccino.alimenti.entities.Alimento;

public interface AlimentoService {

	void addAlimento(Alimento a);
	void deleteAlimento(Alimento a);
	void deleteAlimento(int id);
	void updateAlimento(Alimento a);
	List<Alimento> getAlimenti();
	List<Alimento> getAlimentiByCategoria(String categoria);
	Alimento getAlimento(int id);
	
}
