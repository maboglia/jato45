package com.bogliaccino.canzoni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.canzoni.entities.Canzone;

public interface CanzoneDAO extends JpaRepository<Canzone, Integer>{

}
