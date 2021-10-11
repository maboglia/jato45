package view;

import model.Cliente;
import model.ContoCorrente;

public class Gestione {

	public static void main(String[] args) {
		
		ContoCorrente[] conti = new ContoCorrente[5];
		
		conti[0] = new ContoCorrente(new Cliente("Thomas", "Passafiume"));
		conti[1] = new ContoCorrente(new Cliente("Gabriele", "Marzano"));
		
		conti[0].versamento(1000);
		System.out.println(conti[0].dammiSaldo());
		conti[0].prelievo(100);
		System.out.println(conti[0].dammiSaldo());
		System.out.println(conti[0].dammiNumeroConto());
		System.out.println(conti[0].getCliente().getNome());
		
		conti[1].versamento(500.0);
		System.out.println(conti[1].dammiSaldo());
		conti[1].prelievo(100.0);
		System.out.println(conti[1].dammiSaldo());
		System.out.println(conti[1].dammiNumeroConto());
		

	}

}
