package metodi;

public class MetodiStatici {

	
	
	
	public static void main(String[] args) {
		stampaMessaggio("ciao mondo");
		stampaMessaggio("come va?");
		ClasseEsterna.metodoStatico();

	}

	private static void stampaMessaggio(String string) {
		System.out.println("-----------------");	
		System.out.println(string);
		System.out.println("-----------------");	
			
	}

}
