package day16_String_manipulation;
import java.util.*;
public class Replace {

	public static void main(String[] args) {
	    System.out.println("enter  word(s) you wanna replace");
		String word = new Scanner (System.in).nextLine();
		word = word.replace("duck","****");
		System.out.println(word);
		System.out.println(word.replace("****", "fuck"));
		System.out.println(word.replace("DuCk", "****"));
		System.out.println(word.replace(" ", "spaceMan"));
	

	}

}
