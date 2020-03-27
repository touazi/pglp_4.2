package uvsq.fr.gl_exo4;

public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoteurRPN m=new MoteurRPN();
		m.ajouterOperande(2.0);
		m.ajouterOperande(2.0);
		m.resultOperation(Operation.PLUS);
		System.out.println(m.getPileOperandes().peek());
	}

}
