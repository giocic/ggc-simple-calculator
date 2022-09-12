package it.ggc.calculator;

/**
 * This is the entry point of the application.
 * It checks received arguments, pass them to a Calculator and prints the result. 
*/
public class App {

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
			System.out.println("sum a b");
			System.out.println("sub a b");
			System.out.println("mul a b");
			System.out.println("div a b");
		}
		
	}

}