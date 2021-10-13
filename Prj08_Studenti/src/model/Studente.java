package model;

public class Studente {

	private int id;//numero di matricola
	private String nome;
	private String cognome;
	private int eta;
	
	/** Per costruire uno Studente devi passare i parametri indicati sotto
	 * @param nome - Come prima stringa inserire il NOME dello 
	 * @param cognome - Come 2° stringa inserire il COGNOME dello 
	 */
	public Studente(String nome, String cognome) {
		this.id = 1;
		this.nome = nome;
		this.cognome = cognome;
		this.eta = 25;
	}
	

	
	
}
