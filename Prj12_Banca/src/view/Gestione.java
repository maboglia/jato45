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
		cc1.addMovimento(new Movimento(100, "stipendio"));
		cc1.addMovimento(new Movimento(-50, "luce e gas"));
		System.out.println(cc1.getSaldo());
		

	}

}
