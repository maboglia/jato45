package controlloflusso;

import java.util.Random;

public class CicliWhile {

	public static void main(String[] args) {

		int a = 1;
		Random r = new Random();
		while (a < 10) {
			a = r.nextInt(11);
			System.out.println("gira perché a vale " + a);
		}
		
		
		for(int num = 20; num >= 0; num--){
			if((num%3 == 0) ||(num%3 == 1)) continue;
                        for(int j = 0;j <= num; j++)System.out.print(".*");
			System.out.println("");
		}
		
		
	}


}
