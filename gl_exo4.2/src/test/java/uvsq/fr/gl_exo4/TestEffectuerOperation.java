package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEffectuerOperation {
	private MoteurRPN M;
	@Before
	public void initialize() {
		M = new MoteurRPN();
	}
	@Test(expected = ArithmeticException.class)
	public void testEnregistrerOperandeException() {
		AjouterUnOperande R=new AjouterUnOperande(M,11.0);
		R.execute();
		EffectuerOperation e=new EffectuerOperation(M,Operation.MULT);
		e.execute();
		}
	@Test
	public void TestAjouterOperande2() {
		AjouterUnOperande R=new AjouterUnOperande(M,2.0);
		AjouterUnOperande R1=new AjouterUnOperande(M,11.0);
		R1.execute();
		R.execute();
		EffectuerOperation e=new EffectuerOperation(M,Operation.MULT);
		e.execute();
		assertTrue(M.getPileOperandes().peek()== 22.0);
	}
}
