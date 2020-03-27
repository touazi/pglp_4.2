package uvsq.fr.gl_exo4;
/**
*classe Quit.
* @author Lylia touazi
*/
public class Quit implements Command {
	/** Interpreteur interpreteur.
	    * @see Undo#Quit(Interpreteur)
	    * @see Undo#execute()
	    */
private Interpreteur interpreteur;
	/**
	 * constructeur Undo.
	 * @param interpreteur
	 * un interpreteur
	 * */
public Quit(Interpreteur interpreteur) {
		this.interpreteur = interpreteur;
		}
	/**
	 * methode execute.
	 * */
public void execute() {
		this.interpreteur.quit();
		}
	}