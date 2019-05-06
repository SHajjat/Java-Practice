package day19_loops;
import java.util.*;
public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double balance , transaction ;
		System.out.println("what is your current balance :");
		balance = scan.nextDouble();
		while (balance>0) {
			System.out.println("what transaction you want to do :");
			transaction = scan.nextDouble();
			balance+=transaction;
			System.out.println("your new balance is : " +balance );
			
		}
		System.out.println("you out of money brah ");
	}

}
