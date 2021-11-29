package interfacce;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ClasseAnonima {

	
	public static void main(String[] args) {
		
		Libro l1 = new Libro("I malavoglia", "Verga", 123, 10);
		Libro l2 = new Libro("Guerra e pace", "Tolstoj ", 130, 8);
		
		List<Libro> libri = Arrays.asList(l1, l2);
		
		Collections.sort(libri);
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		
		System.out.println("----------PREZZO------------");
		
		Collections.sort(libri, (l3, l4) ->  l3.getPrezzo() - l4.getPrezzo());
		
		for (Libro libro : libri) {
			System.out.println(libro);
		}
		System.out.println("----------PAGINE------------");
		
		Collections.sort(libri, (l3, l4) ->  l3.getPagine() - l4.getPagine());
		libri.forEach(l -> System.out.println(l));
		
	}
	
}
