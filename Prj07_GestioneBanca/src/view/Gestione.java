package view;

import controller.BancaController;
import model.Cliente;
import model.ContoCorrente;

public class Gestione {

	public static void main(String[] args) {
		
		BancaController bc = new BancaController();
		bc.addCliente("fabrizio", "galfré");
		bc.addCliente("giorgio", "depetris");
		int i = bc.trovaCliente("giorgio", "depetris");
		Cliente c = bc.trovaCliente(i);
		bc.addConto(c);
		bc.reportClienti();
		bc.reportConti();
		
	}

}
