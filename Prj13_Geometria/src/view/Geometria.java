package view;


import model.Punto;
import model.Segmento;
import model.Triangolo;

public class Geometria {

	public static void main(String[] args) {
		
		Punto a = new Punto(2,1);
		Punto b = new Punto(5,1);
		Punto c = new Punto(5,3);
		
		Segmento ab = new Segmento(a, b);
		Segmento ba = new Segmento(b, a);
		Segmento bc = new Segmento(b, c);
		Segmento ac = new Segmento(a, c);
		
		Triangolo t = new Triangolo(a, b, c);
		System.out.println(t.perimetro());
		System.out.println(t.area());
		
	}
	
}
