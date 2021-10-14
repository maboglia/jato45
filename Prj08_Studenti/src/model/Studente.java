package model;

public class Studente {

	private static int counter = 1;
	private int id;//numero di matricola
	private String nome;
	private String cognome;
	private int eta;
	
	/** Per costruire uno Studente devi passare i parametri indicati sotto
	 * @param nome - Come prima stringa inserire il NOME dello 
	 * @param cognome - Come 2° stringa inserire il COGNOME dello 
	 */
	public Studente(String nome, String cognome) {
		this.id = counter++;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = 25;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEta() {
		return eta;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
	
	
}
