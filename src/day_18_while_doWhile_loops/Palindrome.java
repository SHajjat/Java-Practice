package day_18_while_doWhile_loops;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		//palindrome is a word that can be reversed and stay the same word. like civic , anna, racecar;
		String word = "civic";
		Scanner scan = new Scanner(System.in);
		System.out.println("just give me a word");
		word = scan.next();
		String reversed = "";
		int i = word.length()-1;
		while (i >=0) {
			reversed+= word.charAt(i);
			i--;
		}
	
		boolean result = (reversed.equalsIgnoreCase(word));
		System.out.println(result);
	
	}
}
