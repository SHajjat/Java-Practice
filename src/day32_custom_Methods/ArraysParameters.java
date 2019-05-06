package day32_custom_Methods;
import java.util.*;
public class ArraysParameters {
	public static void main(String[] args) {
		
		int nums []= new int [10];
	    Arrays.fill(nums, 3);
		printArray(nums);
		printArray (new int [] {22,33,44,55});
		print2Arrays(new int[] {1, 2,3}, new int []{5,6,7,8,9});
		
	}
	private static void printArray(int [] nums) {
		System.out.println(Arrays.toString(nums));
		for (int num : nums) {
			System.out.print(num+ " ");
		}
		System.out.println();
	}
	
	private static void print2Arrays ( int [] num1, int [] num2) {
		if (num1.length>=num2.length) {
			System.out.println(Arrays.toString(num1));
			
		}else {
			System.out.println(Arrays.toString(num2));
		}
	}

}
