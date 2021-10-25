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
	
	public boolean login(String user, String passw) {
		for (Utente utente : utenti) {
			if(utente.getUsername().equals(user) && utente.getPassword().equals(passw)) {
				return true;
			}
		}
		
		return false;
	}
	
}
