package com.bogliaccino.alimenti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.alimenti.entities.Alimento;
import com.bogliaccino.alimenti.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	@Override
	public void addAlimento(Alimento a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Alimento getAlimentoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alimento> getAll() {
		
		return repo.findAll();
	}

	@Override
	public List<Alimento> getAllByCategoria(String categoria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alimento updAlimento(Alimento a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAlimentoById(int id) {
		// TODO Auto-generated method stub

	}

}
