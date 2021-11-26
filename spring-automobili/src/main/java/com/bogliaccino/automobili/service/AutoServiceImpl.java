package com.bogliaccino.automobili.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogliaccino.automobili.entities.Automobile;
import com.bogliaccino.automobili.repos.AutomobileDAO;

@Service
public class AutoServiceImpl implements AutoService {

	@Autowired
	private AutomobileDAO repo;
	
	
	
	@Override
	public void addAuto(Automobile a) {
		this.repo.save(a);

	}

	@Override
	public Automobile getAutomobile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Automobile> getAllAuto() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public List<Automobile> getAllAutoByMarca(String marca) {
		
		return this.repo.findByMarca(marca);
	}

}
