package array;

public class DemoCaratteri {

	public static void main(String[] args) {
		
		char c = 65;

		for (int i = 0; i < 10000; i++) {
			System.out.print("" + i + ((char) i) + '\t');
			if(i%15 == 0)
				System.out.println();
		}
		
		char[] caratteri = {'h', 'e', 'l', 'l', 'o'};
		for (int i = 0; i < caratteri.length; i++) {
			System.out.print(caratteri[i]);
		}
	}

}
