package interfacce;

public abstract class Frutta {

	String nome;
	double prezzo;

	/**
	 * @param nome
	 */
	public Frutta(String nome) {
		super();
		this.nome = nome;
	}
	
	double calcolaPrezzo(double peso) {
		return prezzo * peso;
	}
	
}
