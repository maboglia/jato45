package model;

public class Dirigente extends Dipendente {

	private double premio;
	
	public Dirigente(String nome) {
		super(nome);
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}

	public double calcolaPaga() {
		return premio * 3;
	}
	
}
