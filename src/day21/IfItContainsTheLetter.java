package day21;
import java.util.*;
public class IfItContainsTheLetter {

	public static void main(String[] args) {
		String newWord = "";
		String word = new Scanner (System.in).next();
		for (int i = 0 ; i <word.length() ; i++) {
			 
			if (!newWord.contains(""+word.charAt(i))) {
				newWord+=word.charAt(i);
				 
				 
				 
			 }
		
	}
		System.out.println(newWord);

}
}
