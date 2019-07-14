package day65_Collections;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList1 {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		darkAlley(list);
//		list.add(3);
//		System.out.println(list);
//	}
//
//	static void darkAlley(List list) {
//		list.add("not an integer");
List<Integer> nums = new ArrayList<>();
nums.add(50);nums.add(50332);nums.add(323);nums.add(3232);nums.add(6660);nums.add(543);
//Loop using For Each Loop
	for (int n : nums) {
		System.out.print(n + " | ");
	}
		System.out.println();
		//loop using for loop
		
		for (int i = 0 ; i<nums.size();i++){
			System.out.print(nums.get(i)+" | ");
		
	}
		System.out.println();
		//loop using ForEach
		//ForEach method comes from Iterable interface
		//and we need to pass a lambda expression
		//lambda expression is part of java functional programing that started from java 8
		//it is used to pass an implementation to functional interface while programming
		//we need to use -> operator
		nums.forEach(n -> System.out.print(n+" | "));
		System.out.println();
		nums.stream().filter( n -> n<500);
		nums.forEach(n -> System.out.print(n+" | "));
		System.out.println();
		
		//all actions that hava functional programming can also be achieved using traditional
		//for each /for loops
		//functional programming is used to have cleaner shorter code
		//in general java functional programming is slower than traditional loops
		/*public interface MyInterface {
		public abstract boolean test();
		
		public class MyClass implements MyInterface{
		public boolean test(){
		print something
		}
		 */
		
		
		 
		
	}
}
