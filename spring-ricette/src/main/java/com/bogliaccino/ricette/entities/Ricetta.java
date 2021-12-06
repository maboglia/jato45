package com.bogliaccino.ricette.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ricette")
public class Ricetta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "id_paese")
	private Paese paese;
	private String nome;
	private List<String> ingredienti;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Paese getPaese() {
		return paese;
	}
	public void setPaese(Paese paese) {
		this.paese = paese;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(List<String> ingredienti) {
		this.ingredienti = ingredienti;
	}
	
	
	
	
}
