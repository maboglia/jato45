package model;

public class Rettangolo extends Forma{

	Segmento ab, bc, cd, da;

	/**
	 * @param ab
	 * @param bc
	 */
	public Rettangolo(String nome, Segmento ab, Segmento bc) {
		super(nome);
		this.ab = ab;
		this.bc = bc;
	}

	
	public double perimetro() {
		System.out.println("ho usato la formula del rettangolo");
		return 2 * (ab.lunghezza() + bc.lunghezza());
	}


	@Override
	public double area() {
		System.out.println("ho usato la formula del rettangolo");
		return ab.lunghezza() * bc.lunghezza();
	}
	
	
}
