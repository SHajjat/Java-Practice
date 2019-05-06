package monday_class_March25th;

import java.util.*;

public class EnhancedTipCalculator {

	public static void main(String[] args) {
		// Defining Variables
		// *************************************************************************************************
		int people = 1, i = 0 , peopleCounter = 1 ;
		double checkAmount = 1, totalTip = 1, totalPerPerson = 0, tipPerPerson = 0, totalToPay = 0, loyaltyDiscount = 0;
		String answer = "", compare = "" , split="",str = "&";
		boolean counter = true, counter2 = true;
		Scanner scan = new Scanner(System.in);
		String customerNumber,
				numbers[] = { "1", "5713739299", "3019433342", "7036266215", "2405657840", "7039949795" };
		String customerName[] = { "Samir", "Gulnar", "Brunno", "Murat", "Vlad", "Elena" };
		// *************************************************************************************************

		// welcoming message :

		System.out.println("Welcome to Cy_5 Restaurant \nhope you enjoyed your meal");
		System.out.println("*******************************************************");
		// *************************************************************************************************

		// loyalty program :
		System.out.println("Are you part of Cy_5 Loyalty Program ?");
		System.out.println("Please enter Yes or No");

		answer = scan.nextLine();
		while (counter) {

			if (answer.equalsIgnoreCase("Yes")) {
				//System.out.println("Please Enter your phone number as a Numbers only with no spaces");
				counter2 = true;
				while (counter2) {
					System.out.println("Please Enter your phone number as a Numbers only with no spaces");
					customerNumber = scan.nextLine().trim();
					i=0;
					while (i <= numbers.length-1) {
						if (customerNumber.equals(numbers[i])) {
							System.out.println("Welcome back " + customerName[i]);
							System.out.println("For being a loyal customer we offer you 5% dicount on your meal!");
							loyaltyDiscount = 0.05;
							counter = false;
							counter2 = false;
							break;
						} else if (i == numbers.length-1) {
							System.out.println("invalid Entery , please enter a valid number");
							break;

						} else {
							i++;
						}
						
					}
					
				}

			} else if (answer.equalsIgnoreCase("No")) {
				System.out.println("Would you like to Join our loyalty program?\nyou will get 5% off your meal today");
				answer = scan.nextLine();
				if (answer.equalsIgnoreCase("Yes")) {
					int j = customerName.length;
					customerName = Arrays.copyOf(customerName, customerName.length + 1);
					numbers = Arrays.copyOf(numbers, numbers.length + 1);
					System.out.println("Please enter your name");
					customerName[j] = scan.nextLine();
					System.out.println("Please Enter your Number");
					numbers[j] = scan.nextLine();
					System.out.println("Thank you for joining our family " + customerName[j]
							+ " you will get 5% discound on your bill today");
					loyaltyDiscount = 0.05;
					break;

				} else if (answer.equalsIgnoreCase("No")) {
					System.out.println("Sorry to hear that , please consider joining next time");
					break;
				}
			} else {
				System.out.println("invalid answer please enter Yes or no");
			}
			// *************************************************************************************************
			//number of people

		}
		
		counter = true;
	    while (counter) {
		System.out.println("How many people in your party?");
		people = scan.nextInt();
		peopleCounter = people;
		if (people > 1 ) {
			// *************************************************************************************************
			//split
			System.out.println("Would you like to split the check");
			scan.nextLine();
			split = scan.nextLine();
			if (split.equalsIgnoreCase("Yes")) {
				System.out.println("we were happy hosting your party of " + people + " bill will be split");
				counter = false;
				
			}else if (split.equalsIgnoreCase("No")) {
				people = 1;
				if (loyaltyDiscount ==0.05) {
					System.out.println("ooh how  generous of you good thing you have 5% discount");
					
					counter = false;
				}else  {
					System.out.println("ooh how  generous of you");
					counter = false;
				}
					
				}else {
					System.out.println("we are sorry, invalid entery please enter yes or no");
				}
			}else if (people ==1) {
				System.out.println("dinning alone ? thank you for choosing our company");
				counter=false;
				
			}else {
				System.out.println("we are sorry, invalid entery please enter number of people more than zero" );
			}
		}
	 // *************************************************************************************************
	//Check amount
	    
	    counter=true;
	    while(counter) {
	    System.out.println("please enter Check Amount: ");
	       checkAmount = scan.nextDouble();
	       if (checkAmount>=0) {
	    	   counter=false;
	       }else {
	    	   System.out.println("please enter a valid check amount, check amount should be positive");
	       }
	       
	    }
	 // *************************************************************************************************
	//Service Quality
	    counter = true;
		while (counter) {
		
		System.out.println("What was the Service Quality:");
		System.out.println("Please Enter Poor, Fair, Good, Great or Excellent");
		scan.nextLine();
		answer= scan.nextLine().toLowerCase();

	
		switch (answer) {
		case "poor":
			totalTip = checkAmount * 0.05;
			counter =false;

			break;
		case "fair":
			totalTip = checkAmount * 0.1;
			counter =false;

			break;
		case "good":
			totalTip = checkAmount * 0.15;
			counter =false;

			break;
		case "great":
			totalTip = checkAmount * 0.20;
			counter =false;

			break;
		case "excellent":
			totalTip = checkAmount * 0.25;
			counter=false;

			break;
		default:
			System.out.println("Please enter a valid answer");

		}
		}
		
		// *************************************************************************************************
	   // calculations and outputs
		 totalToPay = checkAmount+totalTip;
		
		 totalPerPerson=totalToPay/people;
         tipPerPerson=totalTip/people;
         str = str.repeat(peopleCounter);
         System.out.println("Service Quality was : " +answer);
         System.out.println("Number of people entered: "+str);
         System.out.println("Total to pay: "+totalToPay);
         System.out.println("Total tip: "+totalTip);
         System.out.println("Total per person: " + totalPerPerson);
         System.out.println("Tip per person: "+ tipPerPerson);
         
		 

	}
}
