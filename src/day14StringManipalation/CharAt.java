package day14StringManipalation;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		//print all character one by one
		int i =0 ;
		while ( i  < word.length()) {
			System.out.println(word.charAt(i));
			i++;
		}
		//String word2 and check if the first Character is 'J'
		String word2 = "Java".toLowerCase();
		if (word2.charAt(0)== ('j')) {
			System.out.println("it is mathafacka");
		}else {
			System.out.println("its not motha faka it is "+word2.charAt(0));
		}
			//String word3 that consists of5 characters
			//check if first and last char are the same
			//true ==> first and last 
		
			String word3 = "hakoh";
			String compare = (word3.charAt(0)==word3.charAt(4))? "true": "false";
			System.out.println(compare);
		
			
			
			//String word4 => print last letter
			System.out.println("enter a name man, any name");
			String word4 = new Scanner (System.in).next();
			//int lenght = word4.length()-1;
			System.out.println("the last letter : "+ word4.charAt(word4.length()-1));
	}

}
