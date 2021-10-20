package controller;

import java.util.ArrayList;

import model.Cliente;

public class AnagraficaCliente {
	
	private static ArrayList<Cliente> clienti = new ArrayList<>();
	
	public static void addCliente(Cliente c) {
		clienti.add(c);
		System.out.println("Cliente aggiunto all'anagrafica");
	}

	public static ArrayList<Cliente> getClienti() {
		return clienti;
	}
	
	
}
