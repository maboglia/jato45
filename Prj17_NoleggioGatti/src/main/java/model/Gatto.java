package model;

public class Gatto {

	private String nome;
	private String foto;
	private double prezzo;
	/**
	 * @param nome
	 * @param foto
	 * @param prezzo
	 */
	public Gatto(String nome, String foto, double prezzo) {
		this.nome = nome;
		this.foto = foto;
		this.prezzo = prezzo;
	}
	public String getNome() {
		return nome;
	}
	public String getFoto() {
		return foto;
	}
	public double getPrezzo() {
		return prezzo;
	}
	@Override
	public String toString() {
		return "Gatto [nome=" + nome + ", foto=" + foto + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
