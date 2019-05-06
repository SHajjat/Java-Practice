package day24;
import java.util.*;
public class SumOfTheNumbers {
public static void main(String[] args) {
	//lets create an array of int length 3
	
	int[] numbers = new int [3];//it will be filled with zeros not nulls
	numbers [0]= 25;
	numbers [1]= 10;
	numbers [2]=20;
	System.out.println(numbers);
	//[I@4d591d15 this is called hash code
	System.out.println(Arrays.toString(numbers));//convert the Array to string, need to import util
	//[5, 10, 20]
	//toString from arrays class can help as to print an arrays as a string
	int sum = 0;
	for (int i = 0 ; i<numbers.length ; i++) {
		sum+= numbers[i];
		
	}
	System.out.println("sum of your numbers ya number " +sum);
	
	//find the biggest value
	int max = Integer.MIN_VALUE;
	for (int i = 0 ; i<numbers.length; i ++) {
		if (numbers[i]>max) {
			max = numbers[i];
		}
	}
	System.out.println(max);
	int min = Integer.MAX_VALUE;
	for (int i = 0 ; i<numbers.length; i ++) {
		if (numbers[i]<min) {
			min = numbers[i];
		}
	}
	System.out.println(min);
}
}
