package gioco;

public class Dado {

	public int facce = 6;
	public int valore;
	
	public void lancia() {
		double casuale = Math.random();
		valore = (int) (casuale * facce ) + 1;
	}
	
}
