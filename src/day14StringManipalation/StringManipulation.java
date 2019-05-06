package day14StringManipalation;
import java.util.*;
public class StringManipulation {
	public static void main (String[] args ) {
		String str1 = "Good Morning";
		//check if it matches "Good Morning and print match or not match
		if (str1.equalsIgnoreCase("GOOd Morning")) {
			System.out.println("it matches");
			if (str1.equals("Good morning")) {
				System.out.println("same case as well");
				
			}else {
				System.out.println("matches but not the same case");
			}
		}else {
			System.out.println("it doesnt match");
		}
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println("Original str1 : ".toUpperCase()+str1);
		str1=str1.toLowerCase();//you have to do this to change the String if you just do it without assigning it wont do it
		System.out.println("now str1 is :"+str1);
       //combine the above methods together
		//convert to all lowercase first then check if it equals("good morning")
		if (str1.toLowerCase().contentEquals("good morning")) {
			System.out.println("chained method matched "+str1);
		}else {
			System.out.println("Chanined method did not match");
		}
		//if (str1.equals.toLowerCase("good morning")) { cant do this
			//System.out.println("you did it man :"+str1);
		System.out.println(str1.charAt(1));
		System.out.println(str1.length());
		//*************************************
		//find out how many characters in the String
		String name = "Samir";
		System.out.println(name.length());
		int length = name.length();
		System.out.println(name +" length is " + length);
		//usernames can not be less than 8 char
		System.out.println("enter your user name");
		String userName = new Scanner(System.in).next();
		for (int i = 0 ; i <1 ; i--) {
		if( userName.length()< 8) {
			System.out.println("user name cant be smaller than 8 characters man enter another one");
			userName = new Scanner(System.in).next();
			i++;
		}else {
			System.out.println("your user name is " + userName);
		return;
		}
		//password must be at least 6 characters
		String OldpassWord = "woodenSpoon";
		String passWordTry = new Scanner (System.in).next();
		System.out.println("Enter new password ");
		
		
		
		}
	

}
}