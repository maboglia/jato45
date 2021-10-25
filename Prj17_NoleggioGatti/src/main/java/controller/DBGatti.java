package controller;

import java.util.ArrayList;

import model.Gatto;

public class DBGatti {

	private ArrayList<Gatto> gatti = new ArrayList<>();
	
	{
		gatti.add(new Gatto("mau", "mau.jpg", 10));
		gatti.add(new Gatto("romeo", "romeo.jpg", 15));
		gatti.add(new Gatto("carlo", "carlo.jpg", 22.5));
	}
	
	public ArrayList<Gatto> getGatti() {
		return gatti;
	}
}
