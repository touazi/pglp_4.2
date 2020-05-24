package uvsq.fr.gl_exo4;

/**
 * classe RetournerLaListeOperande.
 *
 * @author Lylia touazi
 */
public class RetournerLaListeOperande implements Command {
/**
 * MoteurRPN moteurRPN qui est priver.
 *
 * @see RetournerLaListeOperande#RetournerLaListeOperande( MoteurRPN )
 * @see RetournerLaListeOperande#execute()
 */
private MoteurRPN moteurRPN;

/**
 * constructeur RetournerLaListeOperande.
 *
 * @param moteurRPNn le moteur RPN
 */
public RetournerLaListeOperande(final MoteurRPN moteurRPNn) {
this.moteurRPN = moteurRPNn;
}

/**
 * methode execute.
 */
public final void execute() {
System.out.println(moteurRPN.getPileOperandes());
this.moteurRPN.getPileOperandes();
}
}
