package uvsq.fr.gl_exo4;

import java.util.Stack;

/**
 * classe Interpreteur. Implémentez un interpréteur générique Interpreteur qui
 * supporte uniquement les commandes undo et quit. La commande quit stoppe le
 * programme. La commande undo supprime la dernière commande de l’historique.
 * Vous utiliserez le pattern Command pour implémenter les actions.
 *
 * @author Lylia touazi
 */
public class Interpreteur {
/**
 * Stack operandes.
 *
 * @see Interpreteur#Interpreteur()
 * @see Interpreteur#undo()
 */
protected Stack<Double> operandes;
/**
 * Stack HisPileOperandes.
 *
 * @see Interpreteur#Interpreteur()
 * @see Interpreteur#undo()
 */
protected Stack<Stack<Double>> hisPileOperandes;

/**
 * constructeur Interpreteur.
 *
 * @param operandess        l'ensemble des operande
 * @param hisPileOperandess la liste des pile des operande precedent
 */
public Interpreteur(final Stack<Double> operandess,
		final Stack<Stack<Double>> hisPileOperandess) {
	this.operandes = operandess;
	this.hisPileOperandes = hisPileOperandess;
}

/**
 * constructeur Interpreteur.
 */
public Interpreteur() {
	operandes = new Stack<Double>();
	hisPileOperandes = new Stack<Stack<Double>>();
}

/**
 * methode undo.
 */
public final void undo() {
	if (hisPileOperandes.size() > 1) {
		hisPileOperandes.pop();
		operandes.pop();
	} else {
		hisPileOperandes.clear();
		operandes.clear();
	}
}

/**
 * methode quit.
 */
public final void quit() {
	System.exit(0);
}
}
