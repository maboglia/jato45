package model;

import java.util.ArrayList;

public class ContoCorrente {

	private static int numeratoreConti = 1;
	
	private int numeroConto;
	private ArrayList<Cliente> titolari;
	private ArrayList<Movimento> movimenti;
	private double saldo;
	/**
	 * @param titolari
	 */
	public ContoCorrente(ArrayList<Cliente> titolari) {
		this.numeroConto = numeratoreConti++;
		this.saldo = 0;
		this.movimenti = new ArrayList<>();
		this.titolari = titolari;
	}
	//overload del metodo costruttore
	public ContoCorrente(Cliente c) {
		this.numeroConto = numeratoreConti++;
		this.saldo = 0;
		this.movimenti = new ArrayList<>();
		this.titolari = new ArrayList<>();
		this.titolari.add(c);
	}
	
	public void addNuovoTitolare(Cliente c) {
		this.titolari.add(c);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void addMovimento(Movimento m) {
		this.movimenti.add(m);
		this.saldo += m.getAmount();
	}

	public void versamento(double soldi, String desc) {
		if (soldi > 0) {
			if (desc == null)
				desc = "versamento";
			Movimento m = new Movimento(soldi, desc);
			this.movimenti.add(m);
			this.saldo += soldi;
		}
	}
	
	public void prelievo(double soldi, String desc) {
		if (soldi > 0 && soldi <= this.saldo) {
			if (desc == null)
				desc = "prelievo";
			Movimento m = new Movimento(soldi, desc);
			this.movimenti.add(m);
			this.saldo -= soldi;
		}
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	public String stampaTitolari() {
		StringBuilder sb = new StringBuilder("Titolari del cc");
		sb.append("\n" + numeroConto);
		for (Cliente c : titolari) {
			sb.append("\n" + c);
		}
		
		return sb.toString();
	}
	
}
