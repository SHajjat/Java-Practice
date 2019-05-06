package day08_casting_conditional;
import java.util.*;
public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPercerntage = 65
		//yourScorePercentage = scanner
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter your Score");
		int yourScorePercentage = input.nextInt();
		if (yourScorePercentage >= 65)
			System.out.println("your passed, my man!!!");
		else
			System.out.println("get the fuck out");
	}

}
