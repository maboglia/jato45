package model;

import java.util.ArrayList;

public class Pizza {

	private String nome;
	private double prezzo;
	private ArrayList<String> ingredienti;
	private String formato;

	/** Costruttore dell'oggeto <b>Pizza</b>
	 * @param nome Scrivere il nome della pizza da far comparire nel <b>menu</b>
	 * @param prezzo
	 * @param ingredienti Scrivere una lista di ingredienti 
	 * @param formato
	 */
	public Pizza(String nome, double prezzo, ArrayList<String> ingredienti, String formato) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.formato = formato;
	}

	public String getNome() {
		return nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public ArrayList<String> getIngredienti() {
		return ingredienti;
	}

	public String getFormato() {
		return formato;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Pizza " + nome);
		sb.append("\n");
		sb.append("prezzo: " + prezzo + "€" );
		for (String ingr : ingredienti) {
			sb.append(ingr + ", ");
		}

		return sb.toString();
	}
	
	
}
