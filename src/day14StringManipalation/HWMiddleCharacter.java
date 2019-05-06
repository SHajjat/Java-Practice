package day14StringManipalation;
import java.util.*;
public class HWMiddleCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    if (word.length()%2!=0 && word.length()>=3){
	      System.out.println(word.charAt(word.length()/2));
	    }else if (word.length()==1){
	    System.out.println(Character.toString(word.charAt(0))+Character.toString(word.charAt(0))+Character.toString(word.charAt(0)));
	    }else if (word.length()%2==0 && word.length()>=4){
	     System.out.println(word.charAt(word.length()/2-1));
	     System.out.println(word.charAt(word.length()/2));
	    }else if (word.length()==2){
	     System.out.println(word.charAt(word.length()/2));
	     System.out.println(word.charAt(word.length()/2));
	      
	    }

	}

}
