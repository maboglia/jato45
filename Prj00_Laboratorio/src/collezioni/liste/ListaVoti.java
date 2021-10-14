package collezioni.liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListaVoti {

	public static void main(String[] args) {
		ArrayList<Integer> voti = new ArrayList<Integer>();
		int somma = 0;
		Random casuale = new Random();
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			voti.add(casuale.nextInt(31));
		}
		
		Collections.sort(voti);
		
		for (Integer voto : voti) {
			somma += voto;
			System.out.println(voto);
		}

		double media = somma / (double) voti.size();
		System.out.println(media);
		
		long stop = System.currentTimeMillis();
		
		System.out.println(stop-start);
	}

}
