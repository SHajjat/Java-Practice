package day08_casting_conditional;
import java.util.*;
public class VotingEligibility {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("how old are you my man");
	int age = input.nextInt();
	
	if ( age >=18) {
		System.out.println("you good to go man, dont vote for Trump");
	    System.out.println("you could vote for the past " + (age - 18) + " Years. did you????");
	    if ( age >=100)
	    	System.out.println("also you old as Fuckkkk maaaan");
	}else {
		//int timeToVote = 18-age;
		System.out.println("you can vote in " + (18- age) + " Years Kiddo");
		
	}
}
}
