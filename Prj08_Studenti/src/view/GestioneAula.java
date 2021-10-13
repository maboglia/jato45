package view;

import controller.StudenteCtrl;
import model.Studente;

public class GestioneAula {

	public static void main(String[] args) {
		
		StudenteCtrl controller = new StudenteCtrl();
		
		for (Studente s:controller.getRegistro()) {
			System.out.println(s.getCognome());
		}
		
		
	}

}
