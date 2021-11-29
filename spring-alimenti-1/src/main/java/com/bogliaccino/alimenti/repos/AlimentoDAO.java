package com.bogliaccino.alimenti.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bogliaccino.alimenti.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

}
