package controller;

import java.util.ArrayList;

import model.Todo;

public class TodoCtrl {

	private ArrayList<Todo> coseDaFare;

	/**
	 * 
	 */
	public TodoCtrl() {
		this.coseDaFare = new ArrayList<Todo>();
	}
	
	public void addTodo(String cosadafare) {
		//creo un nuovo oggetto di tipo Todo con la descrizione
		Todo nuovo = new Todo(cosadafare);
		//aggiungo all'arraylist il todo appena creato
		this.coseDaFare.add(nuovo);
	}
	
	public void haiCompletato(int indice) {
		if (indice < 0 || indice > this.coseDaFare.size()-1)
			System.out.println("posizione non presente");
		else {
			this.coseDaFare.get(indice).setDone(true);
			System.out.println("nota completata!");
		}
	}
	
	public ArrayList<Todo> getCoseDaFare() {
		return coseDaFare;
	}
}
