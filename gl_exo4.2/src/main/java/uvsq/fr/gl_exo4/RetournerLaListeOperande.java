package uvsq.fr.gl_exo4;
/**
*classe RetournerLaListeOperande.
* @author Lylia touazi
*/
public class RetournerLaListeOperande  implements Command {
	/** MoteurRPN moteurRPN qui est priver.
	    * @see RetournerLaListeOperande#RetournerLaListeOperande( MoteurRPN )
	    * @see RetournerLaListeOperande#execute()
	    */
	private MoteurRPN moteurRPN;
	/**
	 * constructeur RetournerLaListeOperande.
	 * @param moteurRPN le moteur RPN
	 * */
	public RetournerLaListeOperande(MoteurRPN moteurRPN){
		this.moteurRPN=moteurRPN;
	}
	/**
	 * methode execute.
	 * */
	public void execute() {
		System.out.println(moteurRPN.getPileOperandes());
		this.moteurRPN.getPileOperandes();
	}
}
