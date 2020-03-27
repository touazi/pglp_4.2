package uvsq.fr.gl_exo4;

import java.util.Stack;
/**
*classe Interpreteur.
*Implémentez un interpréteur générique Interpreteur
*qui supporte uniquement les commandes
*undo et quit. La commande quit stoppe le programme.
* La commande undo supprime la dernière
*commande de l’historique.
*Vous utiliserez le pattern Command pour implémenter
*les actions.
* @author Lylia touazi
*/
public class Interpreteur {
	  /**
     * Stack operandes.
     * @see Interpreteur#Interpreteur()
     * @see Interpreteur#undo()
     */
	protected  Stack<Double> operandes;
	  /**
     * Stack HisPileOperandes.
     *@see Interpreteur#Interpreteur()
     * @see Interpreteur#undo()
     */
	protected Stack <Stack<Double>> HisPileOperandes;
	/**
	 * constructeur Interpreteur.
	 * @param operandes
	 * l'ensemble des operande
	 * @param HisPileOperandes
	 * la liste des pile des operande precedent
	 * */
	public Interpreteur(Stack<Double> operandes, Stack<Stack<Double>> HisPileOperandes) {
		this.operandes = operandes;
		this.HisPileOperandes = HisPileOperandes;
	}
	/**
	 * constructeur Interpreteur.
	 * */
	public Interpreteur() {
		operandes = new Stack<Double>();
		HisPileOperandes = new Stack<Stack<Double>>();
		}
	/**
	 * methode undo.
	 * */
	public  void undo() {
		if (HisPileOperandes.size() > 1) {
			HisPileOperandes.pop();
			operandes.pop();
			} else {
			HisPileOperandes.clear();
			operandes.clear();
			}
		}
	/**
	 * methode quit.
	 * */
	public void quit() {
		System.exit(0);
		}
	}