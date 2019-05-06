package day09_conditional;
import java.util.*;
public class Canada {
	public static void main(String[] args) {
		//ask user what is the capital of canada
		//and assgin the value to capital variable.
		Scanner input = new Scanner (System.in);
		System.out.println("what is the capital of Canada");
		String capital= input.next();
		
		//check if the asnwer is correct
		if (capital.equalsIgnoreCase("Ottawa"))
			System.out.println("your answer is correct");
		//else if ( capital == ("Ottawa")) 
		// System.out.println("double equal worked");
		else
			System.out.println("your answer is not correct " + capital + " is not the capital of Canada");
//		if (capital.equals("Ottawa"))
//			System.out.println("your answer is correct");
//		else if ( capital == ("Ottawa")) 
//		 System.out.println("double equal worked");
//		else
//			System.out.println("your answer is not correct " + capital + " is not the capital of Canada");
			
		
	}

}
