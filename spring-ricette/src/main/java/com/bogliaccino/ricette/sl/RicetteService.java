package com.bogliaccino.ricette.sl;

import java.util.List;

import com.bogliaccino.ricette.entities.Ricetta;

public interface RicetteService {

	List<Ricetta> getAll();
	void addRicetta(Ricetta r);
}
