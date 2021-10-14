package view;

import controller.TodoCtrl;
import model.Todo;

public class GestionaleTodo {

	public static void main(String[] args) {
		
		TodoCtrl ctrl = new TodoCtrl();
		ctrl.addTodo("Imparare Java");
		ctrl.addTodo("Imparare Javascript");
		ctrl.addTodo("Imparare SQL");
		ctrl.addTodo("Imparare PHP");
		ctrl.addTodo("Imparare Python");//completato
		ctrl.addTodo("Imparare Scala");
		ctrl.addTodo("Imparare Ruby");
		ctrl.addTodo("Imparare C");
		ctrl.addTodo("Imparare C++");
		ctrl.addTodo("Imparare C#");
		ctrl.addTodo("Imparare ADA");
		ctrl.addTodo("Imparare Visual Basic");		
		
		ctrl.haiCompletato(4);
		
		for (Todo nota : ctrl.getCoseDaFare()) {
			System.out.println(nota);
			
		}
		
		
		
	}

}
