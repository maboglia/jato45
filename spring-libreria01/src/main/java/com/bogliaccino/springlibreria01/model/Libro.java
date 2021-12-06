package com.bogliaccino.springlibreria01.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private int pagine;
	private double prezzo;
	private double prezzoIva;
	private int editoreId;
	
	
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
	
	
	public int getPagine() {
		return pagine;
	}



	public void setPagine(int pagine) {
		this.pagine = pagine;
	}



	public double getPrezzoIva() {
		return prezzoIva;
	}



	public void setPrezzoIva(double prezzoIva) {
		this.prezzoIva = prezzoIva;
	}



	public int getEditoreId() {
		return editoreId;
	}



	public void setEditoreId(int editoreId) {
		this.editoreId = editoreId;
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
