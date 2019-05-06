package day21;
import java.util.*;


public class AskForNumbers {
	public static void main(String[] args) {
		int num1,num2 ;
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("Enter Two numbers ");
		num1= scan.nextInt();
		num2=scan.nextInt();
		
		}while(num1+num2<=100);
		System.out.println("bye");
	}

}
