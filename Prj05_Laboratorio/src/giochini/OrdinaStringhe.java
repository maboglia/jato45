package giochini;

import java.util.Arrays;

public class OrdinaStringhe {

	public static void main(String[] args) {
		
		String[] nani = {
				"cucciolo",
				"mammolo",
				"eolo",
				"dotto",
				"Pisolo",
				"brontolo",
				"gongolo"
		};
		
		Arrays.sort(nani);
		
		for (int i = 6; i >= 0; i--) {
			if (i != 3)
			System.out.println("nano " + i + " " + nani[i]);
		}
		
		
		
		for (String n : nani) {
			if (n.length()>5)
			System.out.println(n.toUpperCase());
		}
		
		for (String string : nani) {
			System.out.println(string);
		}
	}
	
}
