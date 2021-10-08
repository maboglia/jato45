package controller;

import model.Todo;

public class TodoCtrl {

	Todo[] todos;

	public TodoCtrl() {
		todos = new Todo[10];
		System.out.println("controller costruito");
	}
	
	public void addTodo(String messaggio) {
		int pos = trovaPostoLibero();
		if (pos > -1)
			todos[pos] = new Todo(messaggio);
		else
			System.out.println("Contenitore pieno!!!");
	}
	
	private int trovaPostoLibero() {
		//int pos = -1;
		
		for (int i = 0; i < todos.length; i++) {
			if (todos[i] == null) {
				return i;
			}
		}
		
		return -1;
	}

	public String[] showAllTodo() {
		String[] allTodos = new String[todos.length];
		for (int i = 0; i < allTodos.length; i++) {
			allTodos[i] = todos[i].toString();
			
		}
		return allTodos;
		
	}
	
	public String showTodo(int pos) {
		return todos[pos].toString();
	}
	
}
