package com.bogliaccino.springlibreria01.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bogliaccino.springlibreria01.model.Libro;

@Repository
public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
