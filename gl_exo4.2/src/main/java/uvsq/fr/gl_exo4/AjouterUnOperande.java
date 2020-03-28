package uvsq.fr.gl_exo4;
/**
*classe AjouterUnOperande.
* @author Lylia touazi
*/
public class AjouterUnOperande implements Command {
	/** MoteurRPN moteurRPN qui est priver.
	    * @see AjouterUnOperande#AjouterUnOperande( MoteurRPN , Double )
	    * @see AjouterUnOperande#execute()
	    */
	private MoteurRPN moteurRPN;
	/** operande qui est priver.
	    * @see AjouterUnOperande#AjouterUnOperande( MoteurRPN , Double)
	    * @see AjouterUnOperande#execute()
	    */
	private Double op;
	
	/**
	 * constructeur AjouterUnOperande.
	 * @param moteurRPN le moteur RPN
	 * @param op L'operande a ajouter a la pile
	 * */
	public AjouterUnOperande(MoteurRPN moteurRPN,Double op) {
		this.moteurRPN=moteurRPN;
		this.op=op;
	}
	/**
	 * methode execute.
	 * */
	public void execute() {
		this.moteurRPN.ajouterOperande(op);
	}
}
