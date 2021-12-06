package com.bogliaccino.ricette.sl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.ricette.dal.PaeseDAO;
import com.bogliaccino.ricette.dal.RicettaDAO;
import com.bogliaccino.ricette.entities.Paese;
import com.bogliaccino.ricette.entities.Ricetta;

@Service
public class RicetteServiceImpl implements RicetteService{

	@Autowired
	private RicettaDAO repo;

	@Autowired
	private PaeseDAO repoPaese;
	
	
	@Override
	public List<Ricetta> getAll() {
		return this.repo.findAll();
	}

	@Override
	public void addRicetta(Ricetta r) {
		Paese paese = this.repoPaese.save(r.getPaese());
		r.setPaese(paese);
		this.repo.save(r);
	}

}
