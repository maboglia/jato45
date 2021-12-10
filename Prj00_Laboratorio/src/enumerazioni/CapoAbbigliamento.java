package enumerazioni;

public class CapoAbbigliamento {

	String nome;
	Taglie taglia;//S, M, L, XL
	Colore colore;//RED, GREEN, BLUE
	double prezzo;
	Genere genere;//UOMO, DONNA, BAMBINO
	/**
	 * @param nome
	 * @param taglia
	 * @param colore
	 * @param prezzo
	 * @param genere
	 */
	public CapoAbbigliamento(String nome, Taglie taglia, Colore colore, double prezzo, Genere genere) {
		super();
		this.nome = nome;
		this.taglia = taglia;
		this.colore = colore;
		this.prezzo = prezzo;
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "CapoAbbigliamento [nome=" + nome + ", taglia=" + taglia + ", colore=" + colore + ", prezzo=" + prezzo
				+ ", genere=" + genere + "]";
	}
	
	
	
	
}
