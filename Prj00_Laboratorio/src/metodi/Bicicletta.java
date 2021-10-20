package metodi;

public class Bicicletta {

	private static int test = 1;
	private int numeroTelaio;

	private String colore;
	private String marca;
	public int marcia;
	private int velocita;
	
	public Bicicletta() {
		
		this.numeroTelaio = incrementaNumTelaio();
		this.setColore("bianco");
		this.marca = "bianchi";
		this.marcia = 1;
	}
	
	private static int incrementaNumTelaio() {
		return test++;
	}
	
	public String getColore() {
		System.out.println("ho ritornato il colore della bicicletta");
		return this.colore.toUpperCase();
	}

	public void setColore(String c) {
		this.colore = c;
	}
	
	public void setMarcia(int marcia) {
		if (marcia > 0  && marcia < 7 )
			this.marcia = marcia;
	}
	public void cambia(int marcia) {
		if (marcia > 0  && marcia < 7 )
		this.marcia = marcia;
	}
}
