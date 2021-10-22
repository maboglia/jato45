package controller;

import java.util.ArrayList;

public class BancaPippo {

	private ArrayList<Filiale> filiali = new ArrayList<>();

	public void addFiliale(Filiale f) {
		filiali.add(f);
	}
	
	public ArrayList<Filiale> getFiliali() {
		return filiali;
	}
	
	
	
}
