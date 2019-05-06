package day16_String_manipulation;
import java.util.*;

import javax.sound.midi.Soundbank;
public class GetNumberFromString {
	public static void main (String[]args) {
		System.out.println("enter the sentence you want to find");
	   String sentence = new Scanner(System.in).nextLine();
		//String sentence = "I wrote [12] Lines of code";
		int bigLocation = sentence.indexOf("[");
		int secondLocation = sentence.indexOf("]", bigLocation);
		System.out.println(bigLocation + " "+ secondLocation);
		String codeCount = sentence.substring(bigLocation+1 , secondLocation);
		System.out.println(codeCount);
		// check if codeCount is more than 20
		int count = Integer.parseInt(codeCount);//change sring to int
		if (count >= 20) {
			System.out.println("good job");
		}else {
			System.out.println("not enough");
		}
		
		
	}

}
