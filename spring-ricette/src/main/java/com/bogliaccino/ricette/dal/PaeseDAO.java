package com.bogliaccino.ricette.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.ricette.entities.Paese;

public interface PaeseDAO extends JpaRepository<Paese, Integer> {

}
