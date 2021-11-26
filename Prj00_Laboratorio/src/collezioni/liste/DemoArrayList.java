package collezioni.liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		List<String> giorni = new ArrayList<String>();
		List<String> giorni2 = new LinkedList<String>();
		
		giorni.add("lunedì");//0
		giorni.add("martedì");
		giorni.add("mercoledì");
		giorni.add("giovedì");
		giorni.add("venerdì");
		giorni.add("sabato");
		giorni.add("domenica");//6

		System.out.println(giorni.get(0));//giorni[0]
		System.out.println(giorni.size());//giorni.length
		giorni.remove(3);
		System.out.println(giorni.size());//giorni.length
		for (String giorno : giorni) {
			System.out.println(giorno);
		}
		Collections.sort(giorni);
		System.out.println("------------ordinati------------");
		for (String giorno : giorni) {
			System.out.println(giorno);
		}
		
	}

}
