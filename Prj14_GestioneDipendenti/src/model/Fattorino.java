package model;

public class Fattorino extends Dipendente {

	private int consegne;
	
	public Fattorino(String nome) {
		super(nome);
	}

	public int getConsegne() {
		return consegne;
	}

	public void setConsegne(int consegne) {
		this.consegne = consegne;
	}

	public double calcolaPaga() {
		return consegne * 5;
	}
	
}
