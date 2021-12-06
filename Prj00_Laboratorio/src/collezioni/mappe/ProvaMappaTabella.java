package collezioni.mappe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import interfacce.Libro;

public class ProvaMappaTabella {

	public static void main(String[] args) {
		
		Map<Integer, Libro> libriMappa = new HashMap<>();
		//Collection<Libro> libriLista = new ArrayList<Libro>();
		
		libriMappa.keySet();//set di k
		libriMappa.values();//collezione di v
		for (Entry<Integer, Libro> libro : libriMappa.entrySet()) {
			System.out.println(libro.getKey());
			System.out.println(libro.getValue());
		}
		
		
	}
	
}
