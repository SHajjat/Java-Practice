package day_17;
import java.util.*;
public class MessegeBodyWarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    String firstName = email.substring(0,email.indexOf("_"));
	    String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
	    String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
	    String topLevel = email.substring(email.indexOf(".")+1);
	    firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	    lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	    
	    System.out.println("First name: "+firstName);
	    System.out.println("Last name: "+lastName);
	    System.out.println("Domain: "+domain);
	    System.out.println("Top-Level Domain: "+topLevel);
	    System.out.println("hello bakhorocha");
	    
	    

	}

}
