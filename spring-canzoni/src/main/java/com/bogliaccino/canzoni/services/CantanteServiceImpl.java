package com.bogliaccino.canzoni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.canzoni.dal.CantanteDAO;
import com.bogliaccino.canzoni.entities.Cantante;

@Service
public class CantanteServiceImpl implements CantanteService {

	@Autowired
	private CantanteDAO repo;
	
	
	@Override
	public Cantante getCantante(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cantante> getCantanti() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addCantante(Cantante c) {
		this.repo.save(c);

	}

	@Override
	public void updCantante(Cantante c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delCantante(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cantante> getCantantiStartingFor(String prefix) {
		// TODO Auto-generated method stub
		return repo.findByNomeStartingWith(prefix);
	}

	@Override
	public List<Cantante> getCantantiContatining(String prefix) {
		// TODO Auto-generated method stub
		return repo.findByNomeContaining(prefix);
	}

	@Override
	public Cantante getCantanteByNome(String nome) {
		
		return repo.findByNome(nome).size() > 0 ? 
				repo.findByNome(nome).get(0) : 
					null;
	}

}
