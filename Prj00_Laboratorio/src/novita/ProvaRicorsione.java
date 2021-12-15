package novita;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProvaRicorsione {

	public static void main(String[] args) {
		
		double d = .012;//"0.012"
		
		double somma = d + d +d;

		BigDecimal bigValore = new BigDecimal("0.012");
		
		BigDecimal bigSomma = bigValore.add(bigValore).add(bigValore);
		 
		System.out.println(bigSomma);		
		
		System.out.println(Integer.MAX_VALUE);

		int x = 5;
		long start = System.currentTimeMillis();
		long y = fattoriale(20);//5! = 120

		System.out.println(y);
		long stop = System.currentTimeMillis();

		System.out.println(stop-start);
}

	private static long fattoriale(int i) {
		if (i == 0)
			return 1;
		else
			return i * (fattoriale(i -1));

	}
	
	
	
}
	
	
	
	
	
