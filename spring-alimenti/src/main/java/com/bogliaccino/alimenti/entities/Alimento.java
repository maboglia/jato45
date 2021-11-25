package com.bogliaccino.alimenti.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alimenti")
public class Alimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoria;
	private String prodotto;
	private double proteine;
	@Column(name = "lipidi")
	private double grassi;
	private double carboidrati;
	private int energia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProdotto() {
		return prodotto;
	}
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	public double getProteine() {
		return proteine;
	}
	public void setProteine(double proteine) {
		this.proteine = proteine;
	}
	public double getGrassi() {
		return grassi;
	}
	public void setGrassi(double grassi) {
		this.grassi = grassi;
	}
	public double getCarboidrati() {
		return carboidrati;
	}
	public void setCarboidrati(double carboidrati) {
		this.carboidrati = carboidrati;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}

	

}
