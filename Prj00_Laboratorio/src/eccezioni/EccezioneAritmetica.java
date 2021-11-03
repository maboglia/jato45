package eccezioni;

public class EccezioneAritmetica {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 0;
		
		int[] voti = {28,26,24,18,15,6,10,12,15,26,30};
		
		
		double r = 0.0;
		
		try {
			
			for (int i = 0; i<= voti.length; i++) {
				if (voti[i] >0)
					r = x/voti[i];
				else
					throw new ArithmeticException("occhio!!! non mettere 0 a denominatore");
				
				if (i >= voti.length)
					throw new ArrayIndexOutOfBoundsException("posizione fuori dai limiti dell'array");
				
				System.out.println(r);
			}
			
		} 
		catch (ArithmeticException e) {
			System.err.println("errore aritmetico");
			System.err.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("posizione non disponibile");
			System.err.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.err.println("si è verificata una generica eccezione");
		}
		
		
		

		System.out.println("fine programma");
		
	}

}
