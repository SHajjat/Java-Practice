package homeWorks;
import java.util.*;
public class UniqLetters {
public static String uniqueChars(String str) {

//	   String Uniqe = "";
//	   for (int i = 0 ; i<str.length () ; i++){
//			      if ((str.length()-1) == (str.replace((""+str.charAt(i)) , "").length())) {
//			    	 Uniqe+=str.charAt(i); 
//			      }
//			      
//			      
//			    }
//			    return Uniqe;
	String Uniqe = "";
	   for (int i = 0 ; i<str.length () ; i++){
			      if (!(Uniqe.contains(""+str.charAt(i)))) {
			    	 Uniqe+=str.charAt(i); 
			      }
			      
			      
			    }
			    return Uniqe;
}

//}

	  public static void main(String[] args) {
	    String input = new Scanner (System.in).nextLine();
	    //test your code
	    System.out.println( uniqueChars(input) ) ;
	  }
}
