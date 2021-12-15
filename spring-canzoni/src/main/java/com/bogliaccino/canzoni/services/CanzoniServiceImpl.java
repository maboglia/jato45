package com.bogliaccino.canzoni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.canzoni.dal.CantanteDAO;
import com.bogliaccino.canzoni.dal.CanzoneDAO;
import com.bogliaccino.canzoni.entities.Cantante;
import com.bogliaccino.canzoni.entities.Canzone;

@Service
public class CanzoniServiceImpl implements CanzoniService {

	@Autowired
	private CanzoneDAO repo;
	
	@Autowired
	private CantanteDAO repoCantante;
	
	
	@Override
	public Canzone getCanzone(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addCanzone(Canzone c) {
		this.repo.save(c);
		
	}

	@Override
	public void updCanzone(Canzone c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delCanzone(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String nome) {
		List<Cantante> c = repoCantante.findByNome(nome);
		if (c.size()>0)
			return this.repo.findByCantante(c.get(0));
		return null;
	}

}
