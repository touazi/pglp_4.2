package uvsq.fr.gl_exo4;
/**
*classe EffectuerOperation.
* @author Lylia touazi
*/
public class EffectuerOperation implements Command {
	/** MoteurRPN moteurRPN.
	    * @see EffectuerOperation#EffectuerOperation( MoteurRPN , Operation)
	    * @see EffectuerOperation#execute()
	    */
	private MoteurRPN moteurRPN;
	/** Operation operation.
	    * @see EffectuerOperation#EffectuerOperation( MoteurRPN , Operation)
	    * @see EffectuerOperation#execute()
	    */
	private Operation operation;
	/**
	 * constructeur EffectuerOperation.
	 * @param moteurRPN 
	 * le moteur RPN
	 * @param operation
	 *  l'Operation a effectuer
	 * */
	public EffectuerOperation(MoteurRPN moteurRPN,Operation operation){
		this.moteurRPN=moteurRPN;
		this.operation=operation;
	}
	/**
	 * methode execute.
	 * */
	public void execute() {
		this.moteurRPN.resultOperation(operation);
	}
}
