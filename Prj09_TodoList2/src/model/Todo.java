package model;

public class Todo {
	
	//incapsulamento
	private String description;
	private boolean done;
	
	/**
	 * Costruttore di oggetti di tipo Todo
	 * @param desc - Qui inserire la descrizione di QUESTA nota
	 */
	public Todo(String desc) {//new Todo("andare a ginnastica");
		String commento = "Oggetto Todo costruito!";
		done = false;
		description = desc;
		System.out.println(commento);
	}
	//overload del metodo costruttore: deve avere FIRMA differente
	public Todo(String description, boolean done) {
		this.description = description;
		this.done = done;
	}
	//accessori - getters
	public String getDescription() {
		return description.toUpperCase();
	}
	//mutatori - setters
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	@Override
	public String toString() {
		return "[description=" + description + ", done=" + done + "]";
	}
	
}
