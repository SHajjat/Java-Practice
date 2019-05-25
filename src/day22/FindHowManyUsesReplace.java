package day22;
import java.util.*;
public class FindHowManyUsesReplace {
	public static void main(String[] args) {
		//String word = "including webpages , images";
		//find how many e characters in the word.
		//get the length of word
		//replace all e with empty
		//get the length of word without e
		//do a minus
		 Scanner scan = new Scanner(System.in);
		    int count = 0;
		    String str = scan.next();
		    int n = scan.nextInt();
		    for (int i = 1 ; i <str.length()-2;i++){
		      if ((str.substring( i+n )).contains(str.substring(0,n-1))){
		        str=substring(i+1);
		        count++;
		        
		      }else{
		    	  System.out.println("nooo");
		        return;
		      }
		    }
		    System.out.println(count);
	}

	private static String substring(int i) {
		
		return null;
	}

}
