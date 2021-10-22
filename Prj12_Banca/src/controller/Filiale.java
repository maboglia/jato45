package controller;

import model.Cliente;
import model.ContoCorrente;

public class Filiale {

	public String nomeFiliale;

	/**
	 * @param nomeFiliale
	 */
	public Filiale(String nomeFiliale) {
		this.nomeFiliale = nomeFiliale;
	}

	public void addCliente(String nome) {
		Cliente nuovo = new Cliente(nome);
		AnagraficaCliente.addCliente(nuovo);
		System.out.println("cliente aggiunto!");
	}
	
	public void addConto(Cliente c) {
		ContoCorrente cc = new ContoCorrente(c);
		AnagraficaConti.addConto(cc);
		System.out.println("conto aggiunto");
	} 
	
	public Cliente findByName(String nome) {
		for ( Cliente c : AnagraficaCliente.getClienti()) {
			if (c.getNome().equals(nome))
				return c;
		}
		return null;
	}
}
