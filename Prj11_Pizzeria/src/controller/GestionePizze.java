package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pizza;

public class GestionePizze {

	private ArrayList<Pizza> pizze;
	
	public GestionePizze() {
		this.pizze = new ArrayList<Pizza>();
	}
	
	public void initMenu(String nomeFile) {
		
		File elenco = new File(nomeFile);
		this.pizze.clear();
		try {
			Scanner sc = new Scanner(elenco);
			
			while(sc.hasNextLine()) {
				String[] p = sc.nextLine().split(", ");
				double prezzo = Double.parseDouble(p[1]);
				ArrayList<String> ingredienti = new ArrayList<String>();
				ingredienti.add("pomodoro");
				ingredienti.add("mozzarella");
				ingredienti.add(p[2]);
				//costruisco la pizza
				Pizza pizza = new Pizza(p[0], prezzo, ingredienti, p[3]);
				//aggiungo al contenitore
				this.pizze.add(pizza);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<Pizza> getPizze() {
		return pizze;
	}
	
}
