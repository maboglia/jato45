package model;

public class Quadrato extends Rettangolo{

	Segmento lato;
	
	public Quadrato(Segmento ab) {
		super(ab,ab);
		this.lato = ab;
	}
	
	
	/**
	 * @param ab
	 * @param bc
	 * @param lato
	 */
	public Quadrato(Segmento ab, Segmento bc, Segmento lato) {
		super(ab, bc);
		this.lato = lato;
	}


	@Override
	public double area() {
		System.out.println("ho usato la formula del quadrato");
		return Math.pow(this.lato.lunghezza(), 2);
	}
	
}
