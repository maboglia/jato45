package model;

public class Todo {
	
	String description;
	boolean done;
	
	/**
	 * Costruttore di oggetti di tipo Todo
	 * @param desc - Qui inserire la descrizione di QUESTA nota
	 */
	public Todo(String desc) {//new Todo("andare a ginnastica");
		String commento = "Oggetto Todo costruito!";
		done = false;
		description = desc;
		System.out.println(commento + description);
	}
	
	
}
