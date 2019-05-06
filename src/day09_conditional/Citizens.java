package day09_conditional;
import java.util.*;
public class Citizens {
	public static void main(String[] args) {
	    //WRITE YOUR CODE HERE 
	    Scanner input = new Scanner(System.in);
	    int seniorCitizens, nonSeniorCitizens, age;
	    System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
	    seniorCitizens = input.nextInt();
	    nonSeniorCitizens= input.nextInt();
	    System.out.println("What is new citizen's age?");
	    age = input.nextInt();
	    if (age < 65){
	    nonSeniorCitizens++;
	    System.out.println("Non-Senior Citizen" );
	    }
	    else{
	      System.out.println("Senior Citizen");
	    seniorCitizens++;
	    }
	    System.out.println("New seniorCitizens count "+ seniorCitizens);
	    System.out.println("New nonSeniorCitizens count "+ nonSeniorCitizens);
	    
	  }
	}

