package interfacce;

public class Libro implements Comparable<Libro> {

	private String titolo, autore;
	private int pagine, prezzo;
	
	public Libro(String titolo) {
		this.titolo = titolo;
		this.autore = titolo.substring(0, 4).toUpperCase();
		this.pagine = titolo.length();
		this.prezzo = titolo.length();
		
	}
	
	/**
	 * @param titolo
	 * @param autore
	 * @param pagine
	 * @param prezzo
	 */
	public Libro(String titolo, String autore, int pagine, int prezzo) {

		this.titolo = titolo;
		this.autore = autore;
		this.pagine = pagine;
		this.prezzo = prezzo;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", pagine=" + pagine + ", prezzo=" + prezzo + "]";
	}
	@Override
	public int compareTo(Libro altroLibro) {
		
		return this.titolo.compareTo(altroLibro.titolo);
	}
	
	
}
