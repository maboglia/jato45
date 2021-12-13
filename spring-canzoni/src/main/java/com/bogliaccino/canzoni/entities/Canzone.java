package com.bogliaccino.canzoni.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="canzoni")
public class Canzone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	
	@OneToOne
	@JoinColumn(name = "id_cantante")
	private Cantante cantante;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Cantante getCantante() {
		return cantante;
	}
	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
	}
	
	
	
}
