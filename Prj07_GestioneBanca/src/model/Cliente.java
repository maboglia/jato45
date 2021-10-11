package model;

public class Cliente {

	private String nome, cognome;
	
	public Cliente(String n, String c) {
		nome = n;
		cognome = c;
	}
	
	public String getNome() {
		return nome + " " + cognome;
	}
	
}
