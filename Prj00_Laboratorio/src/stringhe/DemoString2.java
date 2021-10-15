package stringhe;

public class DemoString2 {

	public static void main(String[] args) {
		
		String s1 = "CiaO";
		String s2 = "Ciao mondo";
		
		for (int i = 0; i < s1.length(); i++) {
			//System.out.println(s1.charAt(i));
			if (s1.charAt(i)  == s2.charAt(i)    ) {
				System.out.println("il carattere " + i + " è uguale");
			}
		}
		

	}

}
