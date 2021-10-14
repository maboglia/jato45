package array;

public class DemoString {

	public static void main(String[] args) {
		
//		String s1 = "Hello";
//		String s2 = ", World!";
//
//		String s3 = s1 + s2;
//		String s4 = "Hello, World!";
//		char[] caratteri = {'h', 'e', 'l', 'l', 'o'};
//		String s5 = new String(caratteri);
//		
//		System.out.println(s1.equalsIgnoreCase(s5) );
//		

		String[] settimana = {
				"lunedì",
				"martedì",
				"mercoledì",
				"giovedì",
				"venerdì",
				"sabato",
				"domenica",
		};
		
		String html = "<ul>";
		
				
		for (String giorno : settimana) {
			
			html += "<li>" + giorno.toUpperCase() + "</li>";
			
		}
		
		html += "</ul>";
		
		System.out.println(html);
		
	}

}
