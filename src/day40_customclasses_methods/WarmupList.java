package day40_customclasses_methods;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class WarmupList {
	public static int countOccurances ( ArrayList <String> arrayList , String word ) {
		int count = 0;
		for (String myWord : arrayList) {
			if(word.equals(myWord)) {
				count++;
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		ArrayList < String> myArray = new ArrayList<>();
		myArray.add("samir");
		myArray.add("samir");
		myArray.add("ahmad");
		myArray.add("vlad");
		myArray.add("anna");
		myArray.add("vlad");
		myArray.add("samir");
		System.out.println(countOccurances(myArray,"samir"));
	}

}
