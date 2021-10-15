package controller;

import java.util.ArrayList;
import java.util.Random;

import database.DB;
import model.Studente;

public class Studenti {

	private ArrayList<Studente> registro;
	
	public Studenti() {
		this.registro = new ArrayList<Studente>();
		this.init();
	}
	
	private void init() {
		for (String[] riga : DB.ELENCO) {
			String nome = riga[0];
			String cognome = riga[1];
			
			Studente s = new Studente(nome, cognome);
			this.registro.add(s);
		}
	}
	
	public Studente sorteggiaStudente() {
		Random r = new Random();
		int lunghezza = this.registro.size();
		int casuale = r.nextInt(lunghezza);
		
		return this.registro.get(casuale);
	}
	
}
