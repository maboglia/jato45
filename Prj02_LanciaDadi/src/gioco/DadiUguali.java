package gioco;

public class DadiUguali {

	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();
		int contatore = 100000;
		int vittoria = 0, sconfitta = 0;
		
		for(int i = 0; i < contatore; i++) {
			d1.lancia();
			d2.lancia();
			
			if (d1.valore == d2.valore) {
				//System.out.println("vittoria");
				vittoria++;
			} else {
				//System.out.println("sconfitta");
				sconfitta++;
			}
		}//fine for
		
		System.out.println("hai vinto " + vittoria);
		
		System.out.println("la percentuale è " );
		
	}

}
