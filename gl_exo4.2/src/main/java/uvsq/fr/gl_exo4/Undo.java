package uvsq.fr.gl_exo4;
/**
*classe Undo.
* @author Lylia touazi
*/
public class Undo implements Command {
/** Interpreteur interpreteur.
    * @see Undo#Undo(Interpreteur)
    * @see Undo#execute()
    */
private Interpreteur interpreteur;
	/**
	 * constructeur Undo.
	 * @param interpreteur
	 * un interpreteur
	 * */
public Undo(Interpreteur interpreteur) {
		this.interpreteur = interpreteur;
		}
	/**
	 * methode execute.
	 * */
public void execute() {
		this.interpreteur.undo();
		}
	}