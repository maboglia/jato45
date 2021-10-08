package view;

import java.util.Scanner;

public class DemoWhile {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean condition = true;
		
		while (condition) {
			
			System.out.println("Cosa vuoi fare?");
			String risposta = sc.nextLine();
			
			if (risposta.equals("exit")) {
				condition = false;
			} else {
				System.out.println(risposta);
			}
			
			
			
		}
		
		System.out.println("Fine..............");

	}

}
