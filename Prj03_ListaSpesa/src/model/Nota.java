package model;

public class Nota {

	public boolean completata;
	public String descrizione;
	
	/**
	 * Costruttore dell'oggetto di tipo Nota
	 * @param desc - Qui inserire una stringa come descrizione della nota
	 */
	public Nota(String desc) {
		descrizione = desc;
		completata = false;
		System.out.println("Creata una nuova nota!");
	}
	
	
	
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
