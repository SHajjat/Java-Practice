package day23;
import java.util.*;
public class SixWords {

	public static void main(String[] args) {
		String summary = "";
		String word = "";
		for (int i = 0 ; i<6 ; i++) {
			
			if ( i >0 && i < 6 && !word.contentEquals("java") ) {
				summary += " ,";
			}
			System.out.println("enter word");
		    word = new Scanner (System.in).next();
			if (word.contentEquals("java")) {
				continue;
			}
			summary+=word;
		}
		System.out.println(summary);

	}

}
