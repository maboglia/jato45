package giochini;

import java.util.Arrays;

public class OrdinaInteri {

	public static void main(String[] args) {
		//dati 5 numeri interi, ritornare la sequenza ordinata
		int[] numeri = {12,5,65,4,1};
		
		Arrays.sort(numeri);//static
		
		for (int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}

		

	}

}
