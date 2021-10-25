package controller;

import java.util.ArrayList;

import model.Utente;

public class UtenteCtrl {

	private ArrayList<Utente> utenti = new ArrayList<>();
	
	{
		utenti.add(new Utente("mauro", "12345"));
		utenti.add(new Utente("allen", "54321"));
		utenti.add(new Utente("oscar", "11111"));
	
	}
	
}
