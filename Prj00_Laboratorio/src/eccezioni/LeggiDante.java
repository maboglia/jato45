package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LeggiDante {

	public static void main(String[] args) {
		
		File divina = new File("files/divina.txt");
		
		try {
			Scanner sc = new Scanner(divina);
			String s = sc.nextLine();
			ArrayList<String> parole = new ArrayList<String>();
			HashSet<String> paroleNonRipetute = new HashSet<String>();
			while (sc.hasNext()) {
				s = (String) sc.next();
				if (s.length()>2)
					paroleNonRipetute.add(s);
				parole.add(s);
				
			}
			System.out.println("dante ha scritto " + parole.size() + " parole");
			System.out.println("dante ha scritto " + paroleNonRipetute.size() + " parole non ripetute");
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println("spiacenti, si è verificato un problema nella lettura del file " + e.getMessage());
		}
		

	}

}
