package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.StudenteCtrl;
import model.Studente;

public class GestioneAula {

	public static void main(String[] args) {
		
		StudenteCtrl controller = new StudenteCtrl();
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Studente> presenti = new ArrayList<>();
		ArrayList<Studente> assenti = new ArrayList<>();
		
		for (Studente s : controller.getRegistro()) {
			System.out.print ("E' presente lo studente ");
			System.out.println(s.getCognome() + "?");
			
			String risposta = sc.nextLine();
			
			if (risposta.equalsIgnoreCase("s")) {
				presenti.add(s);
			} else {
				assenti.add(s);
			}
			
		}
		
		System.out.println("sono presenti " + presenti.size() + " studenti");
		for (Studente studente : presenti) {
			System.out.println("Cognome: " + studente.getCognome());
		}
		
		System.out.println("sono assenti " + assenti.size() + " studenti");
		for (Studente studente : assenti) {
			System.out.println("Cognome: " + studente.getCognome());
		}
	}

}
