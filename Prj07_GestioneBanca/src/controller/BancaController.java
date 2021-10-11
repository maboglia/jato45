package controller;

import model.Cliente;
import model.ContoCorrente;

public class BancaController {

	private Cliente[] clienti;
	private ContoCorrente[] conti;
	
	public BancaController() {
		clienti = new Cliente[100];
		conti = new ContoCorrente[100];
	}
	
	public void addCliente(String nome, String cognome) {
		int pos = trovaPostoLibero();
		if (pos > -1) {
		Cliente temp = new Cliente(nome, cognome);
		System.out.println("Cliente aggiunto con successo!");
		} else {
		System.out.println("Cliente NON aggiunto!");
		}
	}
	
	public void addConto(Cliente c) {
		int pos = trovaPostoContiCorrenti();
		if (pos > -1) {
			ContoCorrente temp = new ContoCorrente(c);
			System.out.println("Conto aggiunto con successo");
		} else {
			System.out.println("Conto NON aggiunto");
		}
	}
	
	private int trovaPostoLibero() {
		for (int i = 0; i < clienti.length; i++) {
			if (clienti[i] == null) {
				return i;
			}
		}
		return -1;
	}
	private int trovaPostoContiCorrenti() {
		for (int i = 0; i < conti.length; i++) {
			if (conti[i] == null) {
				return i;
			}
		}
		return -1;
	}

}
