package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;

public class GestioneDip {

	public static void main(String[] args) {
		
		Fattorino f = new Fattorino("Alex");
		f.setConsegne(100);
		
		Fattorino f1 = new Fattorino("Giorgio");
		f1.setConsegne(80);
		
		Impiegato i = new Impiegato("Allen");
		i.setOreLavoro(60);

		Impiegato i1 = new Impiegato("Thomas");
		i1.setOreLavoro(120);		

		Dirigente d = new Dirigente("Alexandra");
		d.setPremio(700);
		
		LibroMatricola.dipendenti.add(f);
		LibroMatricola.dipendenti.add(f1);
		LibroMatricola.dipendenti.add(i);
		LibroMatricola.dipendenti.add(i1);
		LibroMatricola.dipendenti.add(d);
		
		double totaleStipendi = 0;
		for (Dipendente dip : LibroMatricola.dipendenti) {
			System.out.println(dip);
			totaleStipendi += dip.calcolaPaga();
			System.out.println(dip.calcolaPaga());
		}
		System.out.println("spesa per stipendi: " + totaleStipendi);
	}

}
