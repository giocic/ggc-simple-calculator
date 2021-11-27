package it.ggc.calculator;

public class Calculator {
	
	public int executeOperation(final String operator, final int operand1, final int operand2)
	   throws OperatorNotSupportedException {
	   int result = 0;
		if("sum".equals(operator)) {
			result = operand1 + operand2;
		} else {
		   throw new OperatorNotSupportedException();
		}
		return result;
	}
	
}