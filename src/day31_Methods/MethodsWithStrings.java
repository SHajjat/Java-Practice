package day31_Methods;
import java.util.*;
public class MethodsWithStrings {
	public static void main(String[] samir) {
		System.out.println(countwords(new Scanner (System.in).nextLine()));
		
	}
 public static int countwords(String word) {
	 
	 int count = 1;
	 word =word.trim();
	 for (int i = 0 ; i<word.length(); i++) {
		 if (word.charAt(i) ==(' ') ||word.charAt(i) ==(',') ) {
			  count ++;
		  }
	  }
   return count;
 }
}
