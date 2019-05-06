package day14StringManipalation;
import java.util.*;
public class HWReverseWord {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    if (word.length()==5) {
		      word = Character.toString(word.charAt(4))+Character.toString(word.charAt(3))+Character.toString(word.charAt(2))+Character.toString(word.charAt(1))+Character.toString(word.charAt(0));
		     System.out.println(word);//the above change Character to String
		    }else if (word.length()>5){
		      System.out.println("Too long!");
		    }else{
		    System.out.println("Too short!");
		  }

	}

}
