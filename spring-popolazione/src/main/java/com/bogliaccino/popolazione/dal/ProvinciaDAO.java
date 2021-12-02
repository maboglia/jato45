package com.bogliaccino.popolazione.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bogliaccino.popolazione.entities.Provincia;

@Repository
public interface ProvinciaDAO extends JpaRepository<Provincia, Integer>{

	List<Provincia> findByRegione(String regione);
	
}
