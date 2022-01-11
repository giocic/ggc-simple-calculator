package it.ggc.calculator;

/**
 * This component executes operations.
*/
public class Calculator {
	
	/**
	 * Executes an operation with two operands.
	 * @param operator - The operator. It must be not null.
	 * @param operand1 - The first operand. It must not be null.
	 * @param operand2 - The second operand. It must not be null.
	 * @return the result of the operation.
	 * @throws OperatorNotSupportedException if provided operator is not supported.
	*/
	public int executeOperation(final String operator, final int operand1, final int operand2)
	   throws OperatorNotSupportedException {
	   int result = 0;
		if("sum".equals(operator)) {
			result = operand1 + operand2;
		} else if("sub".equals(operator)) {
			result = operand1 - operand2;
		} else if("mul".equals(operator)) {
			result = operand1 *  operand2;
		}else {
		   throw new OperatorNotSupportedException();
		}
		return result;
	}
	
}