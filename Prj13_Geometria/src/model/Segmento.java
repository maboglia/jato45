package model;

public class Segmento {

	private Punto a;
	private Punto b;
	/**
	 * @param a
	 * @param b
	 */
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	public Punto getA() {
		return a;
	}
	public Punto getB() {
		return b;
	};
	
	public double lunghezza() {
		return Math.sqrt(  Math.pow(b.getX() - a.getX(), 2) + 
				Math.pow(b.getY() - a.getY(), 2));
	}
}
