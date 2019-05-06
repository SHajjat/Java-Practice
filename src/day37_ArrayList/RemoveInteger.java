package day37_ArrayList;
import java.util.*;
public class RemoveInteger {
	public static void main(String[] args) {
		ArrayList <Integer> nums = new ArrayList <>(10);//it will still be zero you are saying you will 
		//use an array so declare that array with 10 values
		System.out.println(nums.size());
		nums.add(5);
		nums.add(4);
		nums.add(1990);
		nums.add(10);
		nums.add(20);
		nums.add(100);
		System.out.println(nums.toString());
		nums.remove(5);// if you give it primative it will see it as index
		System.out.println(nums);
		nums.remove(new Integer (5));//if you give it as Integer it will see it as value
		System.out.println(nums);
	}

}
