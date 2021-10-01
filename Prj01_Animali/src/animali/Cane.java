package animali;

public class Cane {

	//commento su una riga
	String colore;//qui scrivo il colore dell'animale
	int eta;
	
	public int dimmiEta() {
		return eta;
	}
	
	public void schedaAnimale() {
		System.out.println("L'animale cane");
//		System.out.println("di colore " + colore);
//		System.out.println("ha un'età " + eta);
		if (eta > 10) {
			System.out.println("se fosse umano avrebbe + di 70 anni");
		} else {
			System.out.println("se fosse umano avrebbe - di 70 anni");			
		}
		System.out.println("--------------------");
	}
}
