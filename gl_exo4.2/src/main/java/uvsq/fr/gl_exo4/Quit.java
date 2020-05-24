package uvsq.fr.gl_exo4;

/**
 * classe Quit.
 *
 * @author Lylia touazi
 */
public class Quit implements Command {
/**
 * Interpreteur interpreteur.
 *
 * @see Undo#Quit(Interpreteur)
 * @see Undo#execute()
 */
private Interpreteur interpreteur;

/**
 * constructeur Undo.
 *
 * @param interpreteurr un interpreteur
 */
public Quit(final Interpreteur interpreteurr) {
this.interpreteur = interpreteurr;
}

/**
 * methode execute.
 */
public final void execute() {
this.interpreteur.quit();
}
}
