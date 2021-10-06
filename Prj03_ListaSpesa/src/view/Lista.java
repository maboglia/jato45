package view;

import java.util.Scanner;

import model.Nota;

public class Lista {

	
	public static void main(String[] args) {

		Nota[] lista = new Nota[10];
		
		
		lista[0] = new Nota();
		lista[0].descrizione = "pane";
		lista[0].completa();

		lista[1] = new Nota();
		lista[1].descrizione = "latte";
		//lista[1].completa();

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null)
				System.out.println(lista[i].stampa());
		}
		
		
	}

}
