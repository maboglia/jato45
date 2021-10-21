package model;

public class Cliente {

	private String nome;

	/**
	 * @param nome
	 */
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
	
	
}
