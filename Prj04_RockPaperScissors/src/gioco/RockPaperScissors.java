package gioco;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		String sceltaUtente = chiediAllUtente();

		String sceltaPC = chiediAlPC();
		
		
		//5) valuto sceltaUmano e sceltaPC
		
		String risultato = valutazione(sceltaUtente, sceltaPC);
		
		
		//6) stampo il risultato
		
		System.out.println("Umano: " + sceltaUtente);
		System.out.println("PC: " + sceltaPC);
		System.out.println("risultato: " + risultato);

	}
	
	private static String valutazione(String sceltaUtente, String sceltaPC) {
		
		String risultato = null;

		if (sceltaUtente.equals(sceltaPC)) {
			risultato = "pareggio";
		} else {
			risultato = "vince uno dei due";
			
			if(sceltaUtente.equals("carta")) {
				if(sceltaPC.equals("pietra")) {
					risultato = "vince UMANO";
				} else {
					risultato = "vince PC";
				}
			}

			if(sceltaUtente.equals("pietra")) {
				if(sceltaPC.equals("forbici")) {
					risultato = "vince UMANO";
				} else {
					risultato = "vince PC";
				}
			}

			if(sceltaUtente.equals("forbici")) {
				if(sceltaPC.equals("carta")) {
					risultato = "vince UMANO";
				} else {
					risultato = "vince PC";
				}
			}
			
		}
		
		return risultato;
	}

	private static String chiediAlPC() {
		
		String risposta = null;
		double casuale = Math.random();//num double casuale tra 0 e <1
		if (casuale < 0.33) {
			risposta = "carta";
		} else if (casuale < 0.66) {
			risposta = "forbici";
		} else {
			risposta = "pietra";
		}
		
		return risposta;
	}

	private static String chiediAllUtente() {
		// creo un oggetto di tipo scanner
		System.out.println("Scegli tra pietra, forbici, carta");
		Scanner input = new Scanner(System.in);
		String risposta = input.nextLine();
		input.close();
		return risposta;
	}

}
