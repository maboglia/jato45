package com.bogliaccino.automobili.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.automobili.entities.Automobile;

public interface AutomobileDAO extends JpaRepository<Automobile, Integer> {

	List<Automobile> findByMarca(String marca);
	
}
