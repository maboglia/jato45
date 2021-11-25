package com.bogliaccino.alimenti.services;

import java.util.List;
import java.util.Optional;

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
		repo.save(a);

	}

	@Override
	public Optional<Alimento> getAlimentoById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
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
		return repo.save(a);
	}

	@Override
	public void deleteAlimentoById(int id) {
		repo.deleteById(id);

	}

}
