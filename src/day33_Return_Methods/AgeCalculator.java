package day33_Return_Methods;
import java.util.*;
public class AgeCalculator {
	public static int calculateAge ( int year) {
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = currYear-year;
		if (age >=0 && age<=14) {
			System.out.println("child");
		}else if (age >=15 && age<=25) {
			System.out.println("youngster");
		}else if (age >=26 && age <=64) {
			System.out.println("adult");
		}else if (age >=65) {
			System.out.println("senior");
		}else {
			System.out.println("invalid age");
			System.exit(0);
		}
		return age;
		
		
	}
	public static void main(String[] args) {
		calculateAge(2020);
		System.out.println(calculateAge(1990)/2);
		
	}

}
