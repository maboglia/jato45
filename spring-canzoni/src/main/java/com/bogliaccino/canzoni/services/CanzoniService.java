package com.bogliaccino.canzoni.services;

import java.util.List;

import com.bogliaccino.canzoni.entities.Cantante;
import com.bogliaccino.canzoni.entities.Canzone;

public interface CanzoniService {

	Canzone getCanzone(int id);
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByCantante(String nome);

	
	
	void addCanzone(Canzone c);
	void updCanzone(Canzone c);
	void delCanzone(int id);
	
}
