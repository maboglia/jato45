package view;

import controller.TodoCtrl;

public class GestionaleTodo {

	public static void main(String[] args) {
		
		TodoCtrl ctrl = new TodoCtrl();
		ctrl.addTodo("Imparare Java");
		ctrl.addTodo("Imparare Javascript");
		ctrl.addTodo("Imparare SQL");
		ctrl.addTodo("Imparare Java");
		ctrl.addTodo("Imparare Javascript");
		ctrl.addTodo("Imparare SQL");
		ctrl.addTodo("Imparare Java");
		ctrl.addTodo("Imparare Javascript");
		ctrl.addTodo("Imparare SQL");
		ctrl.addTodo("Imparare Java");
		ctrl.addTodo("Imparare Javascript");
		ctrl.addTodo("Imparare SQL");		
		

		for (String nota : ctrl.showAllTodo()) {
			System.out.println(nota);
			System.out.println();
		}
		
		
		
	}

}
