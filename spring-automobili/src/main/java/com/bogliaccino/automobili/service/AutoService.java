package com.bogliaccino.automobili.service;

import java.util.List;

import com.bogliaccino.automobili.entities.Automobile;

public interface AutoService {

	void addAuto(Automobile a);
	Automobile getAutomobile(int id);
	List<Automobile> getAllAuto();
	List<Automobile> getAllAutoByMarca(String marca);
}
