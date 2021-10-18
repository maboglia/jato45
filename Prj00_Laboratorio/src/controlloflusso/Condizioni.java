package controlloflusso;

public class Condizioni {

	public static void main(String[] args) {
		
		//if 
		int a= 5, b = 4;
		
		if (a > b) {
			System.out.println("a è maggiore di b");
		} 
		//opzionale
		else if (a == b) {
			System.out.println("a è uguale a b");			
		}
		//opzionale
		else {
			System.out.println("b è maggiore di a");
		}
		
		
		
		char scelta = 'a';
		
		switch (scelta) {
			case 'a':
				//logica per inserire utente
				break;
	
			case 'b':
				
				break;
			default:
			break;
		}
		
		
		

	}

}
