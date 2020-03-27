package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMonTeurRNP {

	private MoteurRPN M;
	@Before
	public void initialize() {
		M = new MoteurRPN();
	}

	@Test
	public void TestAjouterOperande() {
		M.ajouterOperande(11.0);
		M.ajouterOperande(20.0);
		M.ajouterOperande(1.0);
		assertEquals(M.getPileOperandes().size(), 3);
	}
	@Test
	public void TestAjouterOperande2() {
		M.ajouterOperande(11.0);
		M.ajouterOperande(20.0);
		M.resultOperation(Operation.PLUS);
		assertTrue(M.getPileOperandes().peek()== 31.0);
	}	
	@Test
	public void TestresultOperation() {
		M.ajouterOperande(11.0);
		M.ajouterOperande(20.0);
		M.ajouterOperande(1.0);
		assertTrue(M.getPileOperandes().peek()== 1.0);
	}	
	
	
	@Test
	public void TestgetPileOperandes() {
		assertEquals(M.getPileOperandes().size(), 0);
	}	

	@Test(expected = ArithmeticException.class)
		public void testEnregistrerOperandeException() {
			M.ajouterOperande(5.0);
			M.resultOperation(Operation.MULT);
			}

	@Test(expected = ArithmeticException.class)
	public void testAppliquerOperation() throws ArithmeticException {
		M.ajouterOperande(0.0);
		M.ajouterOperande(2.0);
		M.resultOperation(Operation.DIV);
		}
	@Test(expected = ArithmeticException.class)
	public void testappliquerOperationException() {
		M.resultOperation(Operation.PLUS);
	}

}
