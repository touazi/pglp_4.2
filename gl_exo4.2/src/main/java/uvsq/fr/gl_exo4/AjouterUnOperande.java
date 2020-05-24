package uvsq.fr.gl_exo4;

/**
 * classe AjouterUnOperande.
 *
 * @author Lylia touazi
 */
public class AjouterUnOperande implements Command {
/**
 * MoteurRPN moteurRPN qui est priver.
 *
 * @see AjouterUnOperande#AjouterUnOperande( MoteurRPN , Double )
 * @see AjouterUnOperande#execute()
 */
private MoteurRPN moteurRPN;
/**
 * operande qui est priver.
 *
 * @see AjouterUnOperande#AjouterUnOperande( MoteurRPN , Double)
 * @see AjouterUnOperande#execute()
 */
private Double op;

/**
 * constructeur AjouterUnOperande.
 *
 * @param moteurRPNn le moteur RPN
 * @param opp        L'operande a ajouter a la pile
 */
public AjouterUnOperande(
	final MoteurRPN moteurRPNn,
	final Double opp) {
	this.moteurRPN = moteurRPNn;
	this.op = opp;
}

/**
 * methode execute.
 */
public final void execute() {
	this.moteurRPN.ajouterOperande(op);
}
}
