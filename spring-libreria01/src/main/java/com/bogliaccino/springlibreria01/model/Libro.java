package com.bogliaccino.springlibreria01.model;

public class Libro {

	private int id;
	private String titolo;
	private double prezzo;
	
	public Libro() {}
	
	
	
	/**
	 * @param id
	 * @param titolo
	 * @param prezzo
	 */
	public Libro(int id, String titolo, double prezzo) {
		this.id = id;
		this.titolo = titolo;
		this.prezzo = prezzo;
	}



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
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
