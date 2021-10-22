package view;


import model.Punto;
import model.Quadrato;
import model.Rettangolo;
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
		
		Rettangolo r = new Rettangolo(ab, bc);
		System.out.println(r.perimetro());
		System.out.println(r.area());
		
		Quadrato q = new Quadrato(ab);
		System.out.println(q.perimetro());
		System.out.println(q.area());
		
	}
	
}
