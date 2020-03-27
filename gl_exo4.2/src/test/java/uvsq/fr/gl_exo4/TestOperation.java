package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOperation {

	@Test
	public void TestDiv2() {
		Operation op= Operation.DIV;
		assertTrue(op.getSymbol().equals("/"));
	}
	@Test
	public void TestMult2() {
		Operation op = Operation.MULT;
		assertTrue(op.getSymbol().equals("*"));
		
	}
	@Test
	public void TestPlus2() {
		Operation op = Operation.PLUS;
		assertTrue(op.getSymbol().equals("+"));
		
	}
	@Test
	public void TestMoins2() {
		Operation op = Operation.MOINS;
		assertTrue(op.getSymbol().equals("-"));
		

	}
	@Test
	public void TestPlus() {
		Operation op = Operation.PLUS;
		double op1 = 5, op2 = 5;
		assertTrue(op.eval(op1, op2) == 10.0);
	}

	@Test
	public void TestMoins() {
		Operation op = Operation.MOINS;
		double op1 = 5, op2 = 2;
		assertTrue(op.eval(op1, op2) == 3.0);

	}

	@Test
	public void TestDiv() {
		Operation ope = Operation.DIV;
		double op1 = 12, op2 = 2;
		assertTrue(ope.eval(op1, op2) == 6.0);
	}
	@Test
	public void TestMULT() {
		Operation ope = Operation.MULT;
		double op1 = 12, op2 = 2;
		assertTrue(ope.eval(op1, op2) == 24.0);
	}

}
