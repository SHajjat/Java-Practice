package homeWorks;

import java.util.Arrays;

public class SplitingAnArray {

	public static void main(String[] args) {
		String str1="How is it going";
		String [] arr1= str1.split("");
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		Mouse house = new Mouse();
		System.out.println(house.MAX_LENGTH);
		
		}
	

     public static class Mouse {
     static int MAX_LENGTH = 5;
     int length;
	
	public void grow(int inches) { if (length < MAX_LENGTH) {
		int newSize = length + inches;
		length = newSize; }
	System.out.println(a);
		}
	
	static int a=0;
}
}
