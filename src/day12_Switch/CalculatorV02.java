package day12_Switch;
import java.util.*;
public class CalculatorV02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("enter the second number");
		double num2 = scan.nextDouble();
		System.out.println("what operation you would like to do? + , - , * , / , %");
		String operator = scan.next();
		double result =0.0;
		switch(operator) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			int intNum2 = (int)(num2);
		       switch (intNum2) {
		        case 0 :
		        	System.out.println("you cant divide by 0");
		        	return;
		        default:
			        result = num1/num2;
			         break;}
		   break;
		case "%":
			result = num1%num2;
			break;
		default:
				System.out.println("no such operation supported by the program");
			
		}
		System.out.printf("the result is :%4.2f",result);

	}

}
