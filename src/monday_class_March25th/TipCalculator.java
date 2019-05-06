package monday_class_March25th;

import java.util.*;

public class TipCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Cy_5 Restaurant \nhope you enjoyed your meal");
		
		Scanner scan = new Scanner(System.in);
		int people=0;
		double checkAmount = 0, totalTip = 0, totalPerPerson = 0, tipPerPerson = 0, totalToPay = 0;
		String service = "", split = "";
		boolean answer = true;
		System.out.println("Do you want to Split the Bill");

		while (answer) {
			System.out.println("Please enter Yes or No");
			split = scan.nextLine();
			answer = split.equalsIgnoreCase("yes") || split.equalsIgnoreCase("no") ? false : true;
			
		}
		answer = true;
		if (split.equalsIgnoreCase("yes")) {
		while (answer) {
			System.out.println("Please Enter Number of people:");
			people = scan.nextInt();
			answer = people > 0 ? false : true;
			if(answer) {
				System.out.println("Number of people have to be positive");
			}
		}
		}
		answer = true;
		while (answer) {
			System.out.println("Please Enter Check Amount: ");
			checkAmount = scan.nextDouble();
			answer = checkAmount>= 0 ? false : true;
			if(answer) {
				System.out.println("Check Amount can not be negative, is the restaurant paying you to eat?");
			}
		}
		answer = true;
		while (answer) {
		
		System.out.println("What was the Service Quality:");
		System.out.println("Please Enter Poor, Fair, Good, Great or Excellent");
		scan.nextLine();
		service = scan.nextLine().toLowerCase();

	
		switch (service) {
		case "poor":
			totalTip = checkAmount * 0.05;
			answer =false;

			break;
		case "fair":
			totalTip = checkAmount * 0.1;
			answer =false;

			break;
		case "good":
			totalTip = checkAmount * 0.15;
			answer =false;

			break;
		case "great":
			totalTip = checkAmount * 0.20;
			answer =false;

			break;
		case "exellent":
			totalTip = checkAmount * 0.25;
			answer =false;

			break;
		default:
			System.out.println("Please enter a valid answer");

		}}

		totalToPay = checkAmount + totalTip;
		System.out.println("Total to pay: " + totalToPay);

		if (split.equalsIgnoreCase("yes")) {

			if (people > 0 && people <= 10) {
				totalPerPerson = totalToPay / people;
				tipPerPerson = totalTip / people;
			} else if (people > 10) {
				totalPerPerson = totalToPay / 10;
				tipPerPerson = totalTip / 10;
			} else {
				totalPerPerson = totalToPay;
				tipPerPerson = totalTip;
			}
		} else {
			totalPerPerson = totalToPay;
			tipPerPerson = totalTip;
		}

		System.out.println("Number of people entered: " + people);

		System.out.printf("Total per person: %4.2f" , totalPerPerson);
		System.out.printf("Tip per person: %4.2f" ,tipPerPerson);

	}

}

