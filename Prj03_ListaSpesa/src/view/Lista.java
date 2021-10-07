package view;

import java.util.Scanner;

import controller.Note;
import model.Nota;

public class Lista {

	
	public static void main(String[] args) {

		Note taccuinoRosso = new Note(5);
		
		taccuinoRosso.addNota("pane", 0);
		taccuinoRosso.addNota("vino", 1);
		taccuinoRosso.addNota("latte", 2);
		taccuinoRosso.addNota("biscotti", 3);
		taccuinoRosso.addNota("olio", 4);
		
		taccuinoRosso.stampaLista();
	}

}
