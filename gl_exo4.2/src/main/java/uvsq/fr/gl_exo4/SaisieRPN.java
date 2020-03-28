package uvsq.fr.gl_exo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaisieRPN {
	private final static int MAX_VALUE = 9999;
	private final static int MIN_VALUE = 0;
	private Map<String, Command> cmd;
	MoteurRPN moteurRPN;

	
	public SaisieRPN() {
		moteurRPN = new MoteurRPN();
		cmd =new HashMap<String, Command>(); 
		init();

	}
	public void saisie() {
		System.out.println("###############################################");
		System.out.println("*******Bienvenue dans la calculatriceRPN*******");
		System.out.println("###############################################");
		System.out.println("Pour quitter tapper quit pour faire une retour en arriere tapper undo");
		System.out.println("Saisisez le calcule que vous voullez effectuer: ");
		while (true) {
			String str = new Scanner(System.in).nextLine();
			try {
				invoqueMoteurRPN(str);
			} catch (ArithmeticException | NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void AjouerNewComOperation(String nomCommande, Command command) {
		cmd.put(nomCommande, command);}

	public void invoqueMoteurRPN(String x) throws ArithmeticException {
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
			if (Math.abs(operande) >= MIN_VALUE && operande <= MAX_VALUE) {
				AjouterUnOperande a=new AjouterUnOperande(moteurRPN,operande);
				a.execute();
				command = cmd.get("afficher");
				command.execute();
			} else { 
			if(Math.abs(operande) < MIN_VALUE ) {
				throw new ArithmeticException("Ressayer la valeur est inferieur à la valeur min");
			}
			else {throw new ArithmeticException("Ressayer la valeur est superieur à la valeur max");}
			}
			break;
		}

	}





	public void init() {
		
		Undo undo =new Undo(moteurRPN);
		this.AjouerNewComOperation("undo", undo);
		
		Quit quit=new Quit(moteurRPN);
		this.AjouerNewComOperation("quit", quit);

		EffectuerOperation MULT = new EffectuerOperation(moteurRPN, Operation.MULT);
		this.AjouerNewComOperation("MULT", MULT);

		EffectuerOperation div = new EffectuerOperation(moteurRPN, Operation.DIV);
		this.AjouerNewComOperation("DIV", div);
		
		EffectuerOperation PLUS = new EffectuerOperation(moteurRPN, Operation.PLUS);
		this.AjouerNewComOperation("PLUS", PLUS);

		EffectuerOperation MOINS = new EffectuerOperation(moteurRPN, Operation.MOINS);
		this.AjouerNewComOperation("MOINS", MOINS);
		
		RetournerLaListeOperande retourner=new RetournerLaListeOperande(moteurRPN);
		this.AjouerNewComOperation("afficher", retourner);

	}

}