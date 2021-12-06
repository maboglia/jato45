package collezioni.mappe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvaMappe {

	public static void main(String[] args) {
		
		Map<String, String[]> regioni = new HashMap<>();
		//             set        list
		regioni.put("piemonte", new String[]{"torino", "cuneo"});
		regioni.put("lombardia", new String[]{"milano", "varese"});
		regioni.put("lazio", new String[]{"roma", "viterbo"});
		
		Set<String> keySet = regioni.keySet();
		System.out.println(keySet);
		
		for (String capoluogo : keySet) {
			System.out.println("i comuni del " + capoluogo);
			for (String comune : regioni.get(capoluogo)) {
				System.out.println(comune);
			}
			
		}
		

	}

}
