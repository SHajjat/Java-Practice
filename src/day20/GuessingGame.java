package day20;
import java.util.*;
public class GuessingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// number 0 - 100
		int guessNumber = 0, numberOfGuesses = 1;
		int boundrySmall = 0, boundryLarge = 1_000_000;
		String condition = "";
		System.out.println("Enter number between 0 and 1,000,000 for program to guess:");
		int secretNumber = scan.nextInt();
		if(secretNumber>1_000_000)
			return;
		guessNumber = 500_000;
		if (guessNumber == secretNumber) {
			System.out.println("too easy");
		} else {
			while (guessNumber != secretNumber && !condition.equals("true")) {
				numberOfGuesses++;
				// 50 67
				if (guessNumber < secretNumber) {
					condition = "small";
					// 75 50 67
				} else if (guessNumber > secretNumber)
					condition = "large";
				switch (condition) {
				case "small":
					System.out.println("Your number is too small " + guessNumber);
					boundrySmall = guessNumber;
					guessNumber = (boundryLarge - boundrySmall) / 2 + guessNumber;
					break;
				case "large":
					System.out.println("Your number is too large " + guessNumber);
					boundryLarge = guessNumber;
					guessNumber = (boundryLarge - boundrySmall) / 2 + boundrySmall;
					break;
				}
			}
		}
		System.out.println("Got it after " + numberOfGuesses + " guesses! \nYour number is: " + guessNumber);
		scan.close();
	}

}
