package interfacce;

import java.util.ArrayList;
import java.util.List;

public class Fruttivendolo {

	public static void main(String[] args) {
		
		List<Misurabile> sacchetto = new ArrayList<Misurabile>();
		
		sacchetto.add(new Patata());
		sacchetto.add(new Lampone("lampone1"));
		

	}

}
