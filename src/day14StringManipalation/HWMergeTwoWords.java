package day14StringManipalation;
import java.util.*;
public class HWMergeTwoWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    String combindWord="";
	    if (word1.length()==word2.length() && word1.length()==3){
	      for (int i= 0 ; i<3 ; i++){
	        combindWord += Character.toString(word1.charAt(i))+Character.toString(word2.charAt(i));
	       if(i ==2){
	          System.out.println(combindWord);
	        }
	    }
	      
	    }else {
	    System.out.println("cannot merge");

	}

}
}