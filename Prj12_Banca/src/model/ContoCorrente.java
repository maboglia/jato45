package model;

import java.util.ArrayList;

public class ContoCorrente {

	private static int numeratoreConti = 1;
	
	private ArrayList<Cliente> titolari;
	private int numeroConto;
	private double saldo;
	private ArrayList<Movimento> movimenti;
	/**
	 * @param titolari
	 */
	public ContoCorrente(ArrayList<Cliente> titolari) {
		this.numeroConto = numeratoreConti++;
		this.saldo = 0;
		this.movimenti = new ArrayList<>();
		this.titolari = titolari;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void addMovimento(Movimento m) {
		this.movimenti.add(m);

			this.saldo += m.getAmount();

	}
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	
}
