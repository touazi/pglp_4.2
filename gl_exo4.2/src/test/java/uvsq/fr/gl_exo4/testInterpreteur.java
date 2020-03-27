package uvsq.fr.gl_exo4;

import static org.junit.Assert.*;
import java.util.Stack;
import org.junit.Test;
public class testInterpreteur {
@Test
public void test() {
	Stack<Double> operandes =  new Stack<Double>();
	Stack<Stack<Double>> HisPileOperandes=new Stack<Stack<Double>>();
	Stack<Double> pile_tmp=new Stack<Double>();
	Interpreteur i=new Interpreteur(operandes,HisPileOperandes);
	operandes.add(1.0);
	pile_tmp=new Stack<Double>();
	pile_tmp.addAll(operandes);
	HisPileOperandes.add(pile_tmp);
	operandes.add(8.0);
	pile_tmp=new Stack<Double>();
	pile_tmp.addAll(operandes);
	HisPileOperandes.add(pile_tmp);
	operandes.add(0.0);
	pile_tmp=new Stack<Double>();
	pile_tmp.addAll(operandes);
	HisPileOperandes.add(pile_tmp);		
	Undo U= new Undo(i);
	U.execute();
	assertTrue(operandes.peek()== 8.0);		
	}
}
