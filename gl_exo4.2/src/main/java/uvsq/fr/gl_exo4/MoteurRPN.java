package uvsq.fr.gl_exo4;

import java.util.Stack;

/**
 * classe MoteurRPN. Elle permet de: enregistrer une opérande, appliquer une
 * opération sur les opérandes, retourner l’ensemble des opérandes stockées
 *
 * @author Lylia touazi
 *
 */
public class MoteurRPN extends Interpreteur {

/**
 * CONSTRUCTION MoteurRPN. Il fait appel au constructeur interpreteur
 */
public MoteurRPN() {
	super();
}

/**
 * methode ajouterOperande. elle permet d'enregistrer
 *  une opérande
 *
 * @param operandee l'operande a enregistrer
 */
public final void ajouterOperande(final double operandee) {
	/**
	 * Stack PILE elle est utilisé pour metre a jour
	 *  HisPileOperandes c'est a dire
	 * d'enregistre la nouvelle pile dans la pile des piles
	 */
	Stack<Double> pILE = new Stack<Double>();
	operandes.add(operandee);
	pILE.addAll(operandes);
	hisPileOperandes.add(pILE);
}

/**
 * methode resultOperation. elle permet d'appliquer
 *  une opération sur les
 * opérandes
 *
 * @param operationn l'operation a effectuer
 * @throws ArithmeticException lever une exption arithmetic.
 */
public final void resultOperation(
		final Operation operationn)
				throws ArithmeticException {
	if (operandes.size() >= 2) {
		this.ajouterOperande(operationn.eval(
				operandes.pop(), operandes.pop()));
	} else {
		throw new ArithmeticException("Il y'a qu'un seul"
				+ " operande pour une operation"
				+ " a deux operande ! :( ");
	}
}

/**
 * methode getPileOperandes. elle permet
 *  d'retourner l’ensemble des opérandes
 * stockées
 *
 * @return operation la pile des operandes (la liste des oprerande)
 */
public final Stack<Double> getPileOperandes() {
	return operandes;
}

}
