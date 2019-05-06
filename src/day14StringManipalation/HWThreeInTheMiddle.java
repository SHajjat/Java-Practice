package day14StringManipalation;
import java.util.*;
public class HWThreeInTheMiddle {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    if ((word.length()%2)!=0 && (word.length()>=5)){
		      System.out.println(Character.toString(word.charAt((word.length()/2-1))) + word.charAt((word.length()/2))+word.charAt((word.length()/2+1)));
		    }else{
		      System.out.println("invalid");
		    }
	}

}
