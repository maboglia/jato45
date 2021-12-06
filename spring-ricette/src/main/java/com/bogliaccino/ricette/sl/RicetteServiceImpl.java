package com.bogliaccino.ricette.sl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.ricette.dal.RicettaDAO;
import com.bogliaccino.ricette.entities.Ricetta;

@Service
public class RicetteServiceImpl implements RicetteService {

	@Autowired
	private RicettaDAO repo;
	
	@Override
	public List<Ricetta> getAll() {
		return this.repo.findAll();
	}

	@Override
	public void addRicetta(Ricetta r) {
		this.repo.save(r);
	}

}
