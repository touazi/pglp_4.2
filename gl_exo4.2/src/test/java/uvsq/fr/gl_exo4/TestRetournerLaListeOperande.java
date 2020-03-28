package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRetournerLaListeOperande {

	private MoteurRPN M;
	@Before
	public void initialize() {
		M = new MoteurRPN();
	}
	@Test
	public void test() {
		
		RetournerLaListeOperande n= new RetournerLaListeOperande(M);
		n.execute();
		}

}
