package novita;

public class ProvaVarargs {

	public static void main(String[] args) {
		
		
		System.out.println(media(24, 25, 26, 27));
		System.out.println(media(24, 25, 26, 27, 28, 29));
	}
	
	
	static double media(int... a) {
		
		double totale = 0;
		
		for (int i : a) {
			totale += i;
		}
		
		return totale / a.length;
		
		
	}

}
