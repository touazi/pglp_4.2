package uvsq.fr.gl_exo4;
/**
*enum Operation.
* @author Lylia touazi
*/
public enum Operation {
	/**
	*MULTIPLICATIN.
	*/
	MULT("*") {
		public double eval(double op1 , double op2) {
			return op1 * op2;
		}
	},
	/**DIVISION.*/
	DIV("/") {
		public double eval(double op1 , double op2) throws ArithmeticException {
			if (op2 == 0)
				throw new ArithmeticException("on ne peut pas déviser par zero ! non non :( ");
			else
				return op1 / op2;
		}
	},
	/**ADDITION.*/
	PLUS("+") { 
		public double eval(double op1 , double op2) {
			return op1 + op2;
		}
	},
	/**SOUSTRACTION.*/
	MOINS("-") {
		public double eval(double op1 , double op2) {
			return op1 - op2;
		}
	};
	/**
	 * le symbole de l'operation.*/
	private String symbole;
	/**
	 * constructeur Operation.
	 * @param symbole
	 *le symbole de l'operation
	 * */
Operation(String symbole) {
			this.symbole = symbole;
	}
/**
 * methode getSymbol.
 * @return symbole
 *le symbole de l'operation
 * */
	public String getSymbol() {
		return symbole;
	}
	/**
	 * methode eval.
	 * @param op1
	 *le operand 1 de l'operation
	 * @param op2
	 *le operand 2 de l'operation 
	 * @throws ArithmeticException
	 * SI IL YA UNE DIVISION SUR ZERO OU
	 * LE NOBRE DE OPRENDRES INFERIEUR A 2
	 *  */
	public abstract double eval(double op1 , double op2) throws ArithmeticException;
	}