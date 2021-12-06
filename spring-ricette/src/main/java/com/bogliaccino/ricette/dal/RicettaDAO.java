package com.bogliaccino.ricette.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.ricette.entities.Ricetta;

public interface RicettaDAO extends JpaRepository<Ricetta, Integer> {

}
