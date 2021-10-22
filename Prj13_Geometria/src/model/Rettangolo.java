package model;

public class Rettangolo {

	Segmento ab, bc, cd, da;

	/**
	 * @param ab
	 * @param bc
	 */
	public Rettangolo(Segmento ab, Segmento bc) {
		this.ab = ab;
		this.bc = bc;
	}

	
	public double perimetro() {
		System.out.println("ho usato la formula del rettangolo");
		return 2 * (ab.lunghezza() + bc.lunghezza());
	}
	
	public double area() {
		System.out.println("ho usato la formula del rettangolo");
		return ab.lunghezza() * bc.lunghezza();
	}
	
}
