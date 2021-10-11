package view;

import controller.Calcolatrice;
import controller.CalcolatriceStatica;
import controller.Math;

public class DemoCalcolatrice {
		static double addendo1 = 15.5;
		static double addendo2 = 14.5;
	
		
		public static void main(String[] args) {
		
		

		CalcolatriceStatica.addizione(addendo1, addendo2);
		Math.sottrazione(addendo1, addendo2);
		
		Calcolatrice calc1 = new Calcolatrice();
		Calcolatrice calc2 = new Calcolatrice();
		calc1.moltiplicazione(addendo2, addendo1);
		
	}

}
