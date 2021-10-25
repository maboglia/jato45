package controller;

import java.util.ArrayList;

import model.Gatto;

public class DBGatti {

	private ArrayList<Gatto> gatti = new ArrayList<>();
	
	{
		gatti.add(new Gatto("mau", "https://images-na.ssl-images-amazon.com/images/I/71+mDoHG4mL.png", 10));
		gatti.add(new Gatto("romeo", "https://static01.nyt.com/images/2021/09/14/science/07CAT-STRIPES/07CAT-STRIPES-mediumSquareAt3X-v2.jpg", 15));
		gatti.add(new Gatto("carlo", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg", 22.5));
	}
	
	public ArrayList<Gatto> getGatti() {
		return gatti;
	}
}
