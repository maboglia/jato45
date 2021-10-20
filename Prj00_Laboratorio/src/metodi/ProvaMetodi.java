package metodi;

public class ProvaMetodi {

	public static void main(String[] args) {
		Bicicletta b1 = new Bicicletta(); 
		Bicicletta b2 = new Bicicletta(); 
		
		System.out.println(b1.getColore());
		b1.setColore("rosso");
		System.out.println(b1.getColore());
		b1.marcia = -5;
		b1.cambia(4);
		
		
		
		b2.setColore("verde");
		System.out.println(b2.getColore());
		b2.cambia(5);
		
	}

}
