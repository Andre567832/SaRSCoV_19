package it.contrader.view;

import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class LoginView extends AbstractView {

	private String username;
	
	private String password;

	public void showResults(Request request) {

	}
	/**
	 * chiede in input all'utente uno username e una password usando il metodo getInput() presente in AbstractView
	 */
	public void showOptions() {
		
		System.out.println("......:Benvenuto in SaRSCOV19!:......");
		
		System.out.print("Nome utente: ");
		this.username = getInput();
		
		System.out.print("Password: ");
		this.password = getInput();
	}

	/**
	 * Impacchetta una request (metodo request.put("chiave", valore)) e la manda al controller Home tramite il Dispatcher
	 */
	public void submit() {
		
		Request request = new Request();
		
		request.put("username", username);
		request.put("password", password);
		
		MainDispatcher.getInstance().callAction("Home", "doControl", request);
	}


}
