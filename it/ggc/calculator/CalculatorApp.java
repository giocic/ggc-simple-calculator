package it.ggc.calculator;

public class CalculatorApp {

	public static void main(String[] args) {
		
		if(args.length < 2) {
			System.out.println("Please, provide an operator and some arguments, like this: ");
			System.out.println("sum 1 2");
			return;
		}
		
		String operator = args[0];
		int result = 0;
		if("sum".equals(operator)) {
			if(args.length < 3) {
			   System.out.println("Please, provide at least two operators like this: ");
			   System.out.println("sum 1 2");
			   return;
			}
			int operand1 = Integer.parseInt(args[1]);
			int operand2 = Integer.parseInt(args[2]);
			result = operand1 + operand2;
		} else {
		   System.out.println("Operator not supported. List of supported operators: ");
		   System.out.println("sum");
		   return;
		}
		
		System.out.println("Result is " + result);
	}

}