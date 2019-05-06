package day20;
import java.util.*;
public class MultipicationTable {

	public static void main(String[] args) {
		
		System.out.println("Enter number between 1 and 10 ");
		int number = new Scanner (System.in).nextInt();
		int multip;
		if (number < 1 || number > 10) {
			System.out.println("you entered "+ number + " that number is out of range for some reason");
			System.exit(0);
		}
		for (int i = 1 ; i<=10 ; i++) {
			multip = i * number;
			System.out.println(i + " X "+ number+ " = "+ multip);
		}
		int j = 1_000_000;
		System.out.println(j);
		
		
		
	}
}
