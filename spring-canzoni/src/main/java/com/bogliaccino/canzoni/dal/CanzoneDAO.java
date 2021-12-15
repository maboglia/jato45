package com.bogliaccino.canzoni.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.canzoni.entities.Cantante;
import com.bogliaccino.canzoni.entities.Canzone;

public interface CanzoneDAO extends JpaRepository<Canzone, Integer>{

	List<Canzone> findByCantante(Cantante cantante);
	
}
