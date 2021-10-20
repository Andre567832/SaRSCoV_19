/**
 * Manage a Business Owner view
 */

package it.contrader.view;


/**
 * Per Ulteriori dettagli vedi Guida sez 9 View.
 * Per la descrizione dei metodi vedi l'interfaccia View in questo pacchetto.
 */
import it.contrader.controller.Request;
import it.contrader.main.MainDispatcher;

public class HomeAdminView extends AbstractView {

    private String choice;
    
	private Request request;

	/**
	 * Se la request non � nulla mostra un messaggio di benvenuto
	 */
    public void showResults(Request request) {
    	if(request!=null) {
    	System.out.println("\n Benvenuto in SaRS-CoV19 "+request.get("username").toString() + "\n");
    	}
    }


    /**
     * Chiede all'utente di effettuare una scelta (da console)
     */
    public void showOptions() {
        System.out.println("-------------MENU------------\n");
        System.out.println(" Seleziona cosa vuoi gestire:");
        System.out.println(
        		  "[1]Utenti\n"
        		+ "[2]Eci\n"
        		+ "[3]Statistiche\n"
        		+ "[4]Numero contaggiati\n"
        		+ "[5]Numero guariti\n"
        		+ "[6]Numero vaccinati");
        //Il metodo che salva l'input nella stringa choice.
        //getInput() � definito in AbstractView.
        choice = this.getInput();
    }

    /**
     * Impacchetta una request (in base alla scelta sar� diversa) che invia ai controller tramite il
     * Dispatcher
     */
    public void submit() {    
    	//crea una nuova Request (vedi classe Request)
    	request = new Request();
        switch (choice) {
        case "1":
        	this.request.put("mode", "USERLIST");
        	MainDispatcher.getInstance().callAction("User", "doControl", request);
        	break;
        case "2":
        	MainDispatcher.getInstance().callAction("Login", "doControl", null);
        	break;
        case "3":
        	
        	break;
        case "4":
        	
        	break;
        case "5":
 	
        	break;
        case "6":
 	
        	break;
        default:
            request.put("choice", choice);
        	MainDispatcher.getInstance().callAction("Login", "doControl", request);
        }
    }
}
