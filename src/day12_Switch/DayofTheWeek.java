package day12_Switch;

import java.util.*;

public class DayofTheWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("what day it is 1 mon , 2 tus ...... 7 sunday");
		int day = scan.nextInt();
		switch (day){
			case 1:
				System.out.println("today is Monday");
				break;
            case 2:
				System.out.println("today is Tuesday");
				break;
			case 3:
				System.out.println("today is Wedmsday");
				break;
			case 4:
				System.out.println("today is Thursday");
				break;
			case 5:
				System.out.println("today is Friday");
				break;
			case 6:
				System.out.println("today is Saturday");
				break;
			case 7:
				System.out.println("today is Sunday");
				break;
			default:
				System.out.println("yzm how mfaker kam yum bl esboo3");
	}
}
}
