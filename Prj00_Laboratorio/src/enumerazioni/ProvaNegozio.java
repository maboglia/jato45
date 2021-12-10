package enumerazioni;

public class ProvaNegozio {

	public static void main(String[] args) {
		CapoAbbigliamento gonna = new CapoAbbigliamento("Gonna a pieghe", 
				Taglie.XL, Colore.BLUE, 30, Genere.DONNA);
		
		System.out.println(gonna.taglia.stampaTaglia());
		
	}

}
