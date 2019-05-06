package day31_Methods;
import java.util.*;
public class Calculator {
 public static double add(double num1 ,double num2) {
	 double result =num1+num2;
	 return result;
 }
 public static double sub(double num1 ,double num2) {
	 double result =num1-num2;
	 return result;
}
 public static double divide(double num1 ,double num2) {
	  if (num2!=0) {
	 double result =num1/num2;
	 
	 return result;
	  }else {
		  System.out.println("cant divide by number");
		  return 0;
	  }
	  
	 
 }
 public static double multiply(double num1 ,double num2) {
		 double result =num1*num2;
		 return result;
	 }	 
 public static double remainder(double num1 ,double num2) {
		 double result =num1%num2;
		 return result;
	 }
 public static double opertaion (double num1 ,String oporation , double num2) {
//		 System.out.println("Enter two numbers please");
//		     num1 = new Scanner (System.in).nextDouble();
//		     num2 = new Scanner (System.in).nextDouble();
//		    System.out.println("what opetation you wanna do ?");
//		    oporation = new Scanner (System.in).next();
		 
		double result=0;
		switch (oporation) {
		case ("+"):
	    result =add(num1,num2);
		break;
		case ("-"):
		result =sub(num1,num2);
		break;
		case ("/"):
		result = divide(num1,num2);
		break;
		case ("*"):
		result = multiply(num1, num2);
		break;
		case ("%"):
		result = remainder(num1, num2);
		break;
		default:
			System.out.println("I said operation man ");
		}
		 return result;
		 
	 }
 public static void print(double print) {
	 System.out.println(print);
 }
	 
	 public static void main(String[] args) {
		
	   print((opertaion(new Scanner (System.in).nextDouble(),new Scanner (System.in).next(),new Scanner (System.in).nextDouble())));
	}
}