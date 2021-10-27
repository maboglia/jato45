package model;

public abstract class Forma {//non si possono creare oggetti

	String nome;

	/**
	 * @param nome
	 */
	public Forma(String nome) {
		this.nome = nome;
	}
	
	public abstract double area();//ppc progr. per contratto
	
	
}
