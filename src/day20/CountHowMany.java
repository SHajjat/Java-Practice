package day20;
import java.util.*;
public class CountHowMany {
public static void main(String[] args) {
	//word // char
	//char to count the number of occurrences
	String word = "computer programming";
	char letter = 'm';
	int count = 0;
	for (int i = 0 ; i < word.length(); i++) {
		if (word.charAt(i)==letter) {
			count++;
			
		}
	}
	System.out.println("number of "+ letter + "'s is "+ count);
	
}

}
