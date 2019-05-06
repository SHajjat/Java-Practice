package day08_casting_conditional;

import java.util.Scanner;

public class PhoneNum {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your area code : ");
		int areaCode = scan.nextInt();
		System.out.println("Enter local Number :");
		int localNumber =scan.nextInt();
		String phoneNumber = "("+areaCode+ ")-"+localNumber;
		System.out.println("Dont call " +phoneNumber);

}
}