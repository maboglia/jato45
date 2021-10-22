package model;

public class Impiegato extends Dipendente{

	private int oreLavoro;
	
	public Impiegato(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	public int getOreLavoro() {
		return oreLavoro;
	}

	public void setOreLavoro(int oreLavoro) {
		this.oreLavoro = oreLavoro;
	}

	public double calcolaPaga() {
		return oreLavoro * 7.5;
	}
	
}
