package database;

import java.util.ArrayList;

import model.Panino;
import model.Prodotto;

public class Prodotti {

	public static ArrayList<Prodotto> DB = new ArrayList<>();
	
	static {
		DB.add(new Panino("hamburger", 3.5));
		DB.add(new Panino("cheeseburger", 4.5));
		DB.add(new Panino("fishburger", 5.5));
		
//		DB.add(new Panino("hamburger", 3.5));
//		DB.add(new Panino("cheeseburger", 4.5));
//		DB.add(new Panino("fishburger", 5.5));	
	}
	
	public static Prodotto getProdottoByName(String name) {
		for (Prodotto prodotto : DB) {
			
			if(prodotto.getNome().equals(name))
				return prodotto;
		}
		
		return null;
	}
	
}
