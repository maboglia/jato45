package view;

import java.util.ArrayList;

import controller.AnagraficaCliente;
import model.Cliente;
import model.ContoCorrente;
import model.Movimento;

public class Gestione {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Alexandra");
		Cliente c2 = new Cliente("Riccardo");
		Cliente c3 = new Cliente("Alex");
		//Cliente c4 = new Cliente("Giorgio");
		
		AnagraficaCliente.addCliente(c1);
		AnagraficaCliente.addCliente(c2);
		AnagraficaCliente.addCliente(c3);
		AnagraficaCliente.addCliente(new Cliente("Giorgio"));
		
		ArrayList<Cliente> clienti1 = new ArrayList<Cliente>();
		clienti1.add(c1);
		clienti1.add(c2);
		
		ContoCorrente cc1 = new ContoCorrente(clienti1);
		ContoCorrente cc2 = new ContoCorrente(c3);
		cc2.addNuovoTitolare(new Cliente("gabriele"));
		cc1.addNuovoTitolare(c3);
		cc1.versamento(100, "assegno post-datato");
		cc2.versamento(150, "stipendio");
		
		cc1.prelievo(50, null);
		cc2.prelievo(75, "luce e gas");
		
		System.out.println(cc1.stampaTitolari());
		System.out.println(cc2.stampaTitolari());
	}

}
