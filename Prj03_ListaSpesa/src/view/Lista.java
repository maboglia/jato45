package view;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String risposta = null;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Cosa vuoi comprare?");
			risposta = sc.nextLine();
			if (risposta.equals("pane")) {
				System.out.println("il pane c'è già");
			} else {
			System.out.println("Hai detto che vuoi comprare: ");
			System.out.println(risposta);
			}
		}
		
		
		
		
	}

}
