package com.bogliaccino.canzoni.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.canzoni.entities.Cantante;

public interface CantanteDAO extends JpaRepository<Cantante, Integer>{

	List<Cantante> findByNome(String nome);
	List<Cantante> findByNomeStartingWith(String prefix);
	List<Cantante> findByNomeContaining(String prefix);
	
	
}
