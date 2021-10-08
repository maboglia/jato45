package controller;

import model.Todo;

public class TodoCtrl {

	Todo[] todos;

	public TodoCtrl() {
		todos = new Todo[10];
		System.out.println("controller costruito");
	}
	
	public void addTodo() {
		todos[0] = new Todo("non so cosa dire");
		System.out.println("ho creato e aggiunto il todo");
	}
	
	
	
}
