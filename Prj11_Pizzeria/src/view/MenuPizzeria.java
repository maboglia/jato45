package view;

import java.util.ArrayList;

import controller.GestionePizze;
import model.Pizza;

public class MenuPizzeria {

	public static void main(String[] args) {
		
		GestionePizze ctrl = new GestionePizze();
		
		ctrl.initMenu();
		
		ArrayList<Pizza> pizze = ctrl.getPizze();
		
		for (Pizza pizza : pizze) {
			System.out.println(pizza);
		}
		
	}

}
