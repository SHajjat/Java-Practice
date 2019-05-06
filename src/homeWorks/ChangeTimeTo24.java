package homeWorks;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeTimeTo24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion("12:05:45AM");
	}

	public static void timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String time = "";
		String pm []= {"0" ,"13" , "14","15","16","17","18","19","20","21","22","23" , "12"};
	    String am []= {"0", "1" ,"2" , "3", "4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10","11" ,"00"};
		String[] mockArr = s.split(":");
		if (mockArr[2].contains("PM")) {
			time =""+ pm[Integer.parseInt(mockArr[0])]+":"+mockArr[1]+":"+mockArr[2].substring(0,2);
		}else {
			time =""+ am[Integer.parseInt(mockArr[0])]+":"+mockArr[1]+":"+mockArr[2].substring(0,2);
		}
		System.out.println(time);
		
	}
}
