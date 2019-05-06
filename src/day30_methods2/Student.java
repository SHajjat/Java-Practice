package day30_methods2;
import java.util.*;
public class Student {
	public static void main(String[] args) {
		String studying = new Scanner (System.in).nextLine();
		int num = studying.length()+"should be studying for ".length();
		
		stars(num);
		study(studying);
		stars(num);
		sleep(5);
		
		
		//study (); will not work without any input inside
		
	}
	
	public static void study (String topic) {
		System.out.println("should be studying for "+topic);
	}
	public static void stars (int num) {
		for (int i = 0 ; i<num ; i++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	public static void sleep (int hours) {
		System.out.println("but has Student has been sleeping for " + hours +" hours");
	}

}
