package model;

public class ContoCorrente {

	private static int numeratoreConti = 10000;
	private String numeroConto;
	private Cliente cliente;
	private double saldo;
	
	public ContoCorrente(Cliente nome) {
		saldo = 0.0;
		cliente = nome;
		numeroConto = "000000" + numeratoreConti++;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public String dammiNumeroConto() {
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
