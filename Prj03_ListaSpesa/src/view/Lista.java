package view;

import java.util.Scanner;

import controller.Note;
import model.Nota;

public class Lista {

	
	public static void main(String[] args) {

		Note taccuinoRosso = null;
//		
//		taccuinoRosso.addNota("pane", 0);
//		taccuinoRosso.addNota("vino", 1);
//		taccuinoRosso.addNota("latte", 2);
//		taccuinoRosso.addNota("biscotti", 3);
//		taccuinoRosso.addNota("olio", 4);
//		
//		taccuinoRosso.stampaLista();
	
		boolean b = 5<6;
		char scelta;
		
		
		while (b) {
			scelta = askUser();
			
			if (scelta == 'q') {
				b = false;
				//return;//istruzione che interrompe
				//break;//label che interrompe i cicli
				System.out.println("Fine.....................");
			}
			else {
				if (scelta == 'a') {
					taccuinoRosso = new Note(5);
				} 
				if (scelta == 'b') {
					String testo = testoNota();
					int posizione = posizNota();
					taccuinoRosso.addNota(testo, posizione);
				} 
				if (scelta == 'c') {
					int posizione = posizNota();
					taccuinoRosso.completaNota(0);
				} 
				if (scelta == 'd') {
					taccuinoRosso.stampaLista();
				} 
					
				
				
			}
			
			
		}
	
	}

	private static int posizNota() {
		System.out.println("Inserisci la posizione della nota");
		Scanner sc = new Scanner(System.in);
		int risposta = sc.nextInt();
		//sc.close();
		return risposta;
	}

	private static String testoNota() {
		System.out.println("Inserisci il testo della nota");
		Scanner sc = new Scanner(System.in);
		String risposta = sc.nextLine();
		//sc.close();
		return risposta;
	}

	private static char askUser() {
		System.out.println("---------------------");
		System.out.println("Scegli un'operazione");
		System.out.println("a) crea lista");
		System.out.println("b) crea nota");
		System.out.println("c) completa nota");
		System.out.println("d) stampa lista");
		System.out.println("q) esci");
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		char risposta = sc.nextLine().charAt(0);
//		sc.close();
		return risposta;
	}
	
	
	
	
	
	
	
	

}
