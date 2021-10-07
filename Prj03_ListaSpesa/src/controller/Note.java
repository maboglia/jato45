package controller;

import model.Nota;

public class Note {

	Nota[] notes;
	
	public Note(int numNote) {
		notes = new Nota[numNote];
	}
	
	public void addNota(String desc, int posizione) {
		Nota n = new Nota(desc);
		notes[posizione] = n;
		System.out.println("Nota aggiunta con successo");
	}

	public void stampaLista() {
		//metodo per stampare il contenuto della lista
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] != null) {
				System.out.println(notes[i].stampa());
			}
		}
	}

	public void completaNota(int i) {
		notes[i].completa();
		System.out.println("Nota completata");
	}	
	
}
