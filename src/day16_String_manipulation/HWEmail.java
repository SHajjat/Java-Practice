package day16_String_manipulation;
import java.util.*;
public class HWEmail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    if (email.indexOf("_") !=-1){
	      String newEmail = email.substring(email.indexOf("_")+1,email.indexOf("@"))
	                     +"_"  +email.substring(0,email.indexOf("_"))+email.substring(email.indexOf("@"));
	        System.out.println(newEmail);
	    
	    }else{
	      System.out.println(email);
	    }
	    

	}

}
