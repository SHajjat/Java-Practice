package day14StringManipalation;
import java.util.*;
public class HWMatchNames {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		    System.out.println("Enter full name:");
		    String fullName = scan.nextLine();
		    if (fullName.equals("Max Payne") || fullName.equals("Alan Wake")){
		      System.out.println("User found!");
		    }else{
		      System.out.println("User not found!");
		    }
	}

}
