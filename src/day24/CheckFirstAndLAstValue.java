package day24;

public class CheckFirstAndLAstValue {
public static void main(String[] args) {
	//write a program that will print true if first and last number is the same
	//if first and last value in the array of ints is same print true
	
	int [] numbers = {12, 41,21,41,12};
	if (numbers[0] == numbers [numbers.length-1]) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
