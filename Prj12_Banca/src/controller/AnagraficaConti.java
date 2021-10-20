package controller;

import java.util.ArrayList;

import model.ContoCorrente;
import model.Movimento;

public class AnagraficaConti {

	private static ArrayList<ContoCorrente> conti = new ArrayList<>();
	
	public void addConto(ContoCorrente cc) {
		this.conti.add(cc);
		System.out.println("conto aggiunto");
	}
	
	public void operazioneSuCC(int numConto, Movimento m) {
		for (ContoCorrente contoCorrente : conti) {
			if (contoCorrente.getNumeroConto() == numConto) {
				contoCorrente.addMovimento(m);
			}
		}
	}
	
	public static ArrayList<ContoCorrente> getConti() {
		return conti;
	}
	
}
