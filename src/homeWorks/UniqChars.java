package homeWorks;
import java.util.*;
public class UniqChars {
	  public static void main(String[] args) {
		    //test your code
		    System.out.println( uniqueChars("wooden-spoon") );
		  }
		  
		  
		  public static String uniqueChars(String str) {
		    //TODO: write your below
		    String Uniqe ="";
		    for (int i = 1 ; i<str.length () ; i++){
		      if ((str.length()-1) == (str.replace((""+str.charAt(i)) , "").length())) {
		    	 Uniqe+=str.charAt(i); 
		      }
		      
		      
		    }
		    return Uniqe;
		  }
		}


