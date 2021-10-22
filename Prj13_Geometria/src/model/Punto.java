package model;

public class Punto {

	private int x, y;

	/**
	 * 
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * @param x
	 */
	public Punto(int x) {
		this.y = 0;
		this.x = x;
	}

	/**
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
	
	
	
}
