package model;

public class Nota {

	public boolean completata = false;
	public String descrizione;
	
	public void completa() {
		completata = true;
	}
	
	public String stampa() {
		String nota = null;
		if (completata==true) {
			nota = "[*] ";
		} else {
			nota = "[ ] ";	
		}
		
		return nota + descrizione;
	}
}
