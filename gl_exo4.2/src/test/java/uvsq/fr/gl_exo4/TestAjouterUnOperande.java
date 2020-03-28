package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAjouterUnOperande {

	private MoteurRPN M;
	@Before
	public void initialize() {
		M = new MoteurRPN();
	}

	@Test
	public void TestAjouterOperande() {

		AjouterUnOperande R=new AjouterUnOperande(M,11.0);
		AjouterUnOperande R1=new AjouterUnOperande(M,11.0);
		AjouterUnOperande R3=new AjouterUnOperande(M,11.0);
		R3.execute();
		R1.execute();
		R.execute();
		assertEquals(M.getPileOperandes().size(), 3);
	}
	@Test
	public void TestAjouterOperande2() {
		AjouterUnOperande R=new AjouterUnOperande(M,2.0);
		AjouterUnOperande R1=new AjouterUnOperande(M,11.0);
		R1.execute();
		R.execute();
		assertTrue(M.getPileOperandes().peek()== 2.0);
	}

}
