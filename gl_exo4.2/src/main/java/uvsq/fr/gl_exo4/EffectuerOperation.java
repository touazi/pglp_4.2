package uvsq.fr.gl_exo4;

/**
 * classe EffectuerOperation.
 *
 * @author Lylia touazi
 */
public class EffectuerOperation implements Command {
/**
 * MoteurRPN moteurRPN.
 *
 * @see EffectuerOperation#EffectuerOperation( MoteurRPN , Operation)
 * @see EffectuerOperation#execute()
 */
private MoteurRPN moteurRPN;
/**
 * Operation operation.
 *
 * @see EffectuerOperation#EffectuerOperation( MoteurRPN , Operation)
 * @see EffectuerOperation#execute()
 */
private Operation operation;

/**
 * constructeur EffectuerOperation.
 *
 * @param moteurRPNn le moteur RPN
 * @param operationn l'Operation a effectuer
 */
public EffectuerOperation(
		final MoteurRPN moteurRPNn,
		final Operation operationn) {
	this.moteurRPN = moteurRPNn;
	this.operation = operationn;
}

/**
 * methode execute.
 */
public final void execute() {
	this.moteurRPN.resultOperation(operation);
}
}
