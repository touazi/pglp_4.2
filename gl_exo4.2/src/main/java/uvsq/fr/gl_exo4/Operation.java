package uvsq.fr.gl_exo4;

/**
 * enum Operation.
 *
 * @author Lylia touazi
 */
public enum Operation {
/**
* MULTIPLICATIN.*/
MULT("*") {
/**
 * MULTIPLICATIN.
 * @param op1 operande 1 de l'operation
 * @param op2 operande 2 de l'operation
 * @return resutat de evaluation
 */
public double eval(final double op1,
	final double op2) {
	return op1 * op2;
}
},
/** DIVISION.*/
DIV("/") {
/** DIVISION.
 * @param op1 operande 1 de l'operation
 * @param op2 operande 2 de l'operation
 * @return resutat de evaluation
 * @throws ArithmeticException SI IL YA UNE
 *  DIVISION SUR ZERO OU LE NOBRE DE
 * OPRENDRES INFERIEUR A 2*/
public double eval(final double op1,
		final double op2)
				throws ArithmeticException {
	if (op2 == 0) {
		throw new ArithmeticException("on"
				+ " ne peut pas déviser par"
				+ " zero ! non non :( ");
	} else {
		return op1 / op2;
	}
}
},
/** ADDITION.*/
PLUS("+") {
/** ADDITION.
 * @param op1 operande 1 de l'operation
 * @param op2 operande 2 de l'operation
 * @return resutat de evaluation*/
public double eval(final double op1,
		final double op2) {
	return op1 + op2;
}
},
/** SOUSTRACTION.*/
MOINS("-") {
/** SOUSTRACTION.
 * @param op1 operande 1 de l'operation
 * @param op2 operande 2 de l'operation
 * @return resutat de evaluation*/
public double eval(final double op1,
		final double op2) {
	return op1 - op2;
}
};

/**
 * le symbole de l'operation.
 */
private String symbole;

/**
 * constructeur Operation.
 *
 * @param symbole le symbole de l'operation
 */
Operation(final String symbole) {
	this.symbole = symbole;
}

/**
 * methode getSymbol.
 *
 * @return symbole le symbole de l'operation
 */
public String getSymbol() {
	return symbole;
}

/**
 * methode eval.
 *
 * @param op1 le operand 1 de l'operation
 * @param op2 le operand 2 de l'operation
 * @throws ArithmeticException SI IL YA UNE
 *  DIVISION SUR ZERO OU LE NOBRE DE
 * OPRENDRES INFERIEUR A 2
 * @return resulat de l'avaluation.
 */
public abstract double eval(final double op1,
		final double op2) throws ArithmeticException;
}
