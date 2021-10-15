package view;

import controller.Studenti;
import model.Studente;

public class Estrattore {

	public static void main(String[] args) {
		Studenti ctrl = new Studenti();
		
		Studente s = ctrl.sorteggiaStudente();
		System.out.println(s);

	}

}
