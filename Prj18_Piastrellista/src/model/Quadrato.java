package model;

public class Quadrato extends Rettangolo{

	Segmento lato;
	
	public Quadrato(String nome, Segmento ab) {
		super(nome, ab,ab);
		this.lato = ab;
	}
	
	
	/**
	 * @param ab
	 * @param bc
	 * @param lato
	 */
	public Quadrato(String nome, Segmento ab, Segmento bc, Segmento lato) {
		super(nome, ab, bc);
		this.lato = lato;
	}


	@Override
	public double area() {
		System.out.println("ho usato la formula del quadrato");
		return Math.pow(this.lato.lunghezza(), 2);
	}
	
}
