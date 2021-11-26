package interfacce;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FruttaOrdinata {

	public static void main(String[] args) {
		
		Set<Patata> patate = new TreeSet<Patata>(); 
		
		Patata patata1 = new Patata();
		Patata patata2 = new Patata();

		patate.add(patata1);
		patate.add(patata2);
		
		for (Patata patata : patate) {
			System.out.println(patata);
		}
		
	}

}
