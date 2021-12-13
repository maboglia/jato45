package com.bogliaccino.canzoni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.canzoni.entities.Cantante;

public interface CantanteDAO extends JpaRepository<Cantante, Integer>{

}
