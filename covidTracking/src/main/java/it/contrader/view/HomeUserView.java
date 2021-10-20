package it.contrader.view;


import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeUserView extends AbstractView{

	String choice;

	@Override
	public void showResults(Request request) {
		

	}

	@Override
	public void showOptions() {
		System.out.println("-------------MENU------------\n");
		
		choice = this.getInput();

	}

	@Override
	public void submit() {

		switch (choice) {

		case "e":
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
			break;

		default:
			MainDispatcher.getInstance().callAction("Login", "doControl", null);
		}
	}

}
