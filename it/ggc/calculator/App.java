package it.ggc.calculator;

public class App {
	
	private static class Calculator {
		
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
	
	private static class OperatorNotSupportedException extends Exception {
		
		public OperatorNotSupportedException() {
			super();
		}
		
	}

	public static void main(String[] args) {
		
		if(args.length < 3) {
			System.out.println("Please, provide an operator and two operands, like this: ");
			System.out.println("sum 1 2");
			return;
		}
		
		String operator = args[0];
		int operand1 = Integer.parseInt(args[1]);
		int operand2 = Integer.parseInt(args[2]);
		
		Calculator calculator = new Calculator();
		try {
			int result = calculator.executeOperation(operator, operand1, operand2);
			System.out.println("Result is " + result);
		} catch(OperatorNotSupportedException onse) {
			System.out.println("Operator not supported. List of supported operators: ");
			System.out.println("sum");
		}
		
	}

}