package model;

public class Triangolo {

	Punto a, b, c;
	Segmento ab, ac, bc;
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
	}
	
	public double perimetro() {
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
	}
	
	public double area() {
		double sp = this.perimetro()/2;
		
		return Math.sqrt(sp * 
					(sp - ab.lunghezza()) *
					(sp - ac.lunghezza()) *
					(sp - bc.lunghezza()) 
				);
	}
	
}
