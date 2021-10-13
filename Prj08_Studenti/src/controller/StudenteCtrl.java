package controller;

import database.DB;
import model.Studente;

public class StudenteCtrl {

	private Studente[] registro;
	
	public StudenteCtrl() {
		this.registro = new Studente[DB.STUDENTI.length];
		this.inizializza();
	}
	
	private void inizializza() {
		int i = 0;
		for (String[] riga : DB.STUDENTI) {
//			String nome = riga[0];
//			String cognome = riga[1];
//			Studente temp = new Studente(nome, cognome);
			this.registro[i] = new Studente(riga[0], riga[1]);
			i++;
		}
		
	}
	
	public Studente[] getRegistro() {
		return this.registro;
	}
	
	
}
