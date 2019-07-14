package day64_Collections01;

import java.util.*;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		int [] numsArray = {30,50,5011};
		String [] day = new String[7];
		//Arrays are fixed size
		//allows dubplicates
		//keeps ordering
		//Allows primitive and objects
		day[0]="Monday";
		day[1]="Tuesday";
		day[2]="Wednsday";
		day[3]="Thursday";
		day[4]="friday";
		day[5]="Saturday";
		day[6]="Sunday";
		ArrayList<Integer> ArrayList = new ArrayList<>(10);
		List<Integer> numsList = new ArrayList<>();//roughly the same but using list is more common
		numsList.add(44);
		numsList.add(44);
		numsList.add(55);
		numsList.add(66);
		numsList.add(77);
		System.out.println("it keeps order "+numsList.get(0)+" will always be the same");
		System.out.println("it keeps order "+numsList.get(0)+" will always be the same");
		System.out.println(Arrays.toString(numsArray));// remember when you used to know that
		
		
	}
}
