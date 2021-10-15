package stringhe;

public class DemoString {

	public static void main(String[] args) {
		
		String s = "ciao";
		String s2 = new String("ciao");
		String s3 = "ciao";
		
		System.out.println(s == s2);//confronto il riferimento
		System.out.println(s.equals(s3));
		System.out.println(s.equals(s2));
		char a = 'a';
		char b = 'a';
		
		System.out.println(a == b);//confronto il valore

	}

}
