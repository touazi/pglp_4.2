package uvsq.fr.gl_exo4;

import java.util.Stack;
/**
*classe MoteurRPN.
*Elle permet de:
*enregistrer une opérande,
*appliquer une opération sur les opérandes,
*retourner l’ensemble des opérandes stockées
* @author Lylia touazi
*
*/
public class MoteurRPN extends Interpreteur {


/**
 * CONSTRUCTION MoteurRPN.
 * Il fait appel au constructeur interpreteur
 * */
	public MoteurRPN() {
		super();
		}
	/**
	 * methode ajouterOperande.
	 * elle permet d'enregistrer une opérande
	 * @param operande
	 * l'operande a enregistrer
	 * */
	public void ajouterOperande(double operande) {
		  /**
	     * Stack PILE
	     * elle est utilisé pour metre a jour HisPileOperandes
	     * c'est a dire d'enregistre la nouvelle pile dans la pile des piles
	     */
		Stack<Double> PILE = new Stack<Double>();
		operandes.add(operande);
		PILE.addAll(operandes);
		HisPileOperandes.add(PILE);
	}
	/**
	 * methode resultOperation.
	 * elle permet d'appliquer une opération sur les opérandes
	 * @param operation
	 * l'operation a effectuer
	 * */
	public void resultOperation(Operation operation) throws ArithmeticException {
		if (operandes.size() >= 2) {
		this.ajouterOperande(operation.eval(operandes.pop(), operandes.pop()));
		}
		else
			throw new ArithmeticException("Il y'a qu'un seul operande pour une operation a deux operande ! :( ");
		}

	/**
	 * methode getPileOperandes.
	 * elle permet d'retourner l’ensemble des opérandes stockées
	 * @return operation
	 * la pile des operandes (la liste des oprerande)
	 * */
	public Stack <Double> getPileOperandes() {
		return operandes;
		}


}
