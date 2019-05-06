package day12_Switch;

import java.util.*;


//import sun.tools.jstat.Operator;

public class CalculatorV01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Number ");
		double result ;
		double num1 = input.nextDouble();
		System.out.println("Enter the Second Number ");
		double num2 = input.nextDouble();
		System.out.println("Enter the Operation +, - , * , / or % ");
		String operation = input.next();
		if (operation.contentEquals("+")) {
			result = num1 + num2;
		} else if (operation.contentEquals("-")) {
			result = num1 - num2;
		
		} else if (operation.contentEquals("*")) {
			result = num1 * num2;

		} else if (operation.contentEquals("/")) {
			result = num1 / num2;

		} else if (operation.contentEquals("%")) {
			result = num1 % num2;
		
		} else {
			System.out.println("God freaking damn man you" + " can do a simple task I asked for "
					+ "operator and you put " + operation);
            return;//it means do not execute the remaining code. stop here
		}
		if (result == 1/0.0)
			System.out.println("its infinity, you can divide by 0 man, if you do this again I am coming for you");
		else
		//System.out.println("your result is : " + Math.round(result));
			System.out.printf("your result is : $%1000.2f and %4.2f",result,num2);
	}
}