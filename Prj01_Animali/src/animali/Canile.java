package animali;

public class Canile {

	public static void main(String[] args) {
		
		Cane bobi = new Cane();//ho costruito il primo cane
		bobi.colore = "bianco";
		bobi.eta = 9;
		
		bobi.schedaAnimale();
		int p = bobi.dimmiEta();
		System.out.println(p);
		Cane fido = new Cane();//costruttore di cane
		fido.colore = "nero";
		fido.eta = 13;
		
		fido.schedaAnimale();
		
		Gatto mau = new Gatto();
		mau.nome = "pippo";
		System.out.println("Il mio gatto si chiama " + mau.nome);
		mau.faiFusa();
		
		
	}

}
