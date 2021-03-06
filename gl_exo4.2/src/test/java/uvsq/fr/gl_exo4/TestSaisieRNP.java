package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSaisieRNP {
	private SaisieRPN S;
	@Before
	public void initialize() {
		S = new SaisieRPN();
	}
	@Test
	public void testinvoqueMoteurRPN1() {
		S.invoqueMoteurRPN("3");
		S.invoqueMoteurRPN("1");
		assertTrue(S.getMoteurRPN().getPileOperandes().peek() == 1.0);	
		
		}
	public void testinvoqueMoteurRPN2() {
		S.invoqueMoteurRPN("3");
		S.invoqueMoteurRPN("1");
		S.invoqueMoteurRPN("+");
		assertTrue(S.getMoteurRPN().getPileOperandes().peek() == 4.0);	
		assertTrue(S.getMoteurRPN().getPileOperandes().size() == 1);
		}
	@Test(expected = ArithmeticException.class)
	public void testinvoqueMoteurRPN2EXEPTION() throws ArithmeticException {
	S.invoqueMoteurRPN("150");
		}
	@Test(expected = ArithmeticException.class)
	public void testinvoqueMoteurRPN2EX() throws ArithmeticException {
		S.invoqueMoteurRPN("1");
		S.invoqueMoteurRPN("+");
			}
	@Test(expected = ArithmeticException.class)
	public void testinvoqueMoteurDIV() throws ArithmeticException {
		S.invoqueMoteurRPN("0");
		S.invoqueMoteurRPN("1");
		S.invoqueMoteurRPN("/");
			}
	
	
	

	public void testAjouerNewComOperation() {
		S.invoqueMoteurRPN("3");
		S.invoqueMoteurRPN("1");
		Undo undo =new Undo(S.getMoteurRPN());
		S.ajouerNewComOperation("undo", undo);
		undo.execute();
		assertTrue(S.getMoteurRPN().getPileOperandes().peek()== 3.0);
		}
}
