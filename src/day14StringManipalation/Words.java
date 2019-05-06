package day14StringManipalation;
import java.util.*;
public class Words {

	public static void main(String[] args) {
		System.out.println("Enter Two words");
		String word1 = new Scanner (System.in).next();
		String word2 = new Scanner (System.in).next();
		String longerWord = word1.length()>word2.length() ? word1 : word2 ;
		System.out.println(longerWord);

	}

}
