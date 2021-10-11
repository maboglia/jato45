package model;

public class ContoCorrente {

	private static int numeratoreConti = 10000;
	private int numeroConto;
	private String nomeCliente;
	private double saldo;
	
	public ContoCorrente(String nome) {
		saldo = 0.0;
		nomeCliente = nome;
		numeroConto = numeratoreConti++;
	}
	
	public int dammiNumeroConto() {
		return numeroConto;
	}
	
	public double dammiSaldo() {
		return saldo;
	}
	
	public void versamento(double euro) {
		//saldo = saldo + euro;
		saldo += euro;
	}

	public void prelievo(double euro) {
		if (saldo > euro)
		saldo -= euro;
	}
	
	
}
