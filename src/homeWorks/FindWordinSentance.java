package homeWorks;
import java.util.*;
public class FindWordinSentance {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		    String word = scan.nextLine();
		    String sentence = scan.nextLine();
		    //WRITE YOUR CODE HERE
		    boolean answer =false;
		    int wordLength = word.length();
		    System.out.println(wordLength);
		    for( int i = 1 ; i <= sentence.length()-word.length(); i++){
		      if (word.charAt(0)==sentence.charAt(i)){
		    	 System.out.println(sentence.substring(i,i+wordLength));
		        if(word.equalsIgnoreCase(sentence.substring(i,i+wordLength))){
		        	System.out.println(sentence.substring(i,i+wordLength));
		        	
		         answer = true;
		        }
		        
		      }
		    }
         System.out.println(answer);
	}

}
