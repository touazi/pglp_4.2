package uvsq.fr.gl_exo4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * classe MoteurRPN. Elle permet de: enregistrer d'interagir avec l'utilisateur,
 *
 * @author Lylia touazi
 *
 */
public class SaisieRPN {
/** valeur max. */
	static int MAX = 100;
/** valeur min. */
static int  MIN= 0;
/** map de command. */
private Map<String, Command> cmd;
/** moteur rnp. */
private MoteurRPN moteurRPN;

/** constructeur SaisieRPN. */
public SaisieRPN() {
	moteurRPN = new MoteurRPN();
	cmd = new HashMap<String, Command>();
	init();

}

/**
 * methode getMoteurRPN.
 *
 * @return le moteur Rnp.
 */
public final MoteurRPN getMoteurRPN() {
	return this.moteurRPN;
}

/**
 * methode saisie. l'utilisateur va
 *  saissir une chaine de caratere, et elle va
 * le transformer en un command.
 */
public final void saisie() {
	System.out.println("###"
+ "##########################"
+ "##################");
	System.out.println("***"
			+ "****Bienvenue dans"
			+ " la calculatriceRPN*******");
	System.out.println("#"
			+ "##################"
			+ "############################");
	System.out.println("Pour quitter tapper"
			+ " quit pour faire une retour"
			+ " en arriere tapper undo");
	System.out.println("Saisisez le calcule"
			+ " que vous voullez effectuer: ");
	while (true) {
		String str = new Scanner(System.in).nextLine();
		try {
			invoqueMoteurRPN(str);
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}

/**
 * methode AjouerNewComOperation.
 *
 * @param nomCommande le mon de la command.
 * @param command     la command en question.
 */
public final void ajouerNewComOperation(
		final String nomCommande,
		final Command command) {
	cmd.put(nomCommande, command);
}
/**methode invoqueMoteurRPN.
 * @param x la chaine de caratere.
 * @exception ArithmeticException lever ArithmeticException*/
public final void invoqueMoteurRPN(final String x)
		throws ArithmeticException {
	Command command;
	switch (x) {

	case "+":
		// perform action on invoker object
		command = cmd.get("PLUS");
		command.execute();
		command = cmd.get("afficher");
		command.execute();

		break;
	case "-":
		command = cmd.get("MOINS");
		command.execute();
		command = cmd.get("afficher");
		command.execute();
		break;
	case "*":
		command = cmd.get("MULT");
		command.execute();
		command = cmd.get("afficher");
		command.execute();
		break;
	case "/":
		command = cmd.get("DIV");
		command.execute();
		command = cmd.get("afficher");
		command.execute();
		break;

	case "undo":
		command = cmd.get("undo");
		command.execute();
		command = cmd.get("afficher");
		command.execute();
		break;

	case "quit":
		command = cmd.get("quit");
		command.execute();
		break;
	default:
		double operande = Double.parseDouble(x);
		if (Math.abs(operande) >= MIN
				&& operande <= MAX) {
			AjouterUnOperande a = new
					AjouterUnOperande(moteurRPN, operande);
			a.execute();
			command = cmd.get("afficher");
			command.execute();
		} else {
			if (Math.abs(operande) < MIN) {
				throw new ArithmeticException(""
						+ "Ressayer la valeur est"
						+ " inferieur à la valeur min");
			} else {
				throw new ArithmeticException(""
						+ "Ressayer la valeur est"
						+ " superieur à la valeur max");
			}
		}
		break;
	}

}

/**
 * methode init. permet d'executer le commande.
 */

public final void init() {

	Undo undo = new Undo(moteurRPN);
	this.ajouerNewComOperation("undo", undo);

	Quit quit = new Quit(moteurRPN);
	this.ajouerNewComOperation("quit", quit);

	EffectuerOperation mULT = new EffectuerOperation(
			moteurRPN, Operation.MULT);
	this.ajouerNewComOperation("MULT", mULT);

	EffectuerOperation div = new EffectuerOperation(
			moteurRPN, Operation.DIV);
	this.ajouerNewComOperation("DIV", div);

	EffectuerOperation pLUS = new EffectuerOperation(
			moteurRPN, Operation.PLUS);
	this.ajouerNewComOperation("PLUS", pLUS);

	EffectuerOperation mOINS = new EffectuerOperation(
			moteurRPN, Operation.MOINS);
	this.ajouerNewComOperation("MOINS", mOINS);

	RetournerLaListeOperande retourner = new
			RetournerLaListeOperande(moteurRPN);
	this.ajouerNewComOperation("afficher", retourner);

}

}
