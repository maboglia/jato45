package com.bogliaccino.alimenti.services;

import java.util.List;

import com.bogliaccino.alimenti.entities.Alimento;

public interface AlimentoService {

	//C: passo un alimento da aggiungere al db
	void addAlimento(Alimento a);
	//R: passo un id e mi ritorna un alimento con id corrispondente
	Alimento getAlimentoById(int id);
	//R: mi ritorna una lista di alimenti
	List<Alimento> getAll();
	List<Alimento> getAllByCategoria(String categoria);
	//U: passo un alimento da modificare sul db
	Alimento updAlimento(Alimento a);
	//D: passo un id dell'elemento da eliminare
	void deleteAlimentoById(int id);
}
