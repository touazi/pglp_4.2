package uvsq.fr.gl_exo4;

/**
 * classe Undo.
 *
 * @author Lylia touazi
 */
public class Undo implements Command {
/**
 * Interpreteur interpreteur.
 *
 * @see Undo#Undo(Interpreteur)
 * @see Undo#execute()
 */
private Interpreteur interpreteur;

/**
 * constructeur Undo.
 *
 * @param interpreteurr un interpreteur
 */
public Undo(final Interpreteur interpreteurr) {
	this.interpreteur = interpreteurr;
}

/**
 * methode execute.
 */
public final void execute() {
	this.interpreteur.undo();
}
}
