package model;

public class Dipendente {

	private static int matricolatore = 1;
	
	protected String nome;
	protected int matricola;
	/**
	 * @param nome
	 */
	public Dipendente(String nome) {
		this.nome = nome;
		this.matricola = matricolatore++;
	}
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", matricola=" + matricola + "]";
	}
	
	public double calcolaPaga() {
		return 0;
	}
	
	
}
