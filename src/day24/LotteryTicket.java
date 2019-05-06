package day24;

import java.util.Arrays;

public class LotteryTicket {
public static void main(String[] args) {
	int [] lotteryNumbers = {12, 45, 3, 62, 42, 90};
	System.out.println(Arrays.toString(lotteryNumbers));
	Arrays.sort(lotteryNumbers);
	System.out.println(Arrays.toString(lotteryNumbers));//sort it
	int index =Arrays.binarySearch(lotteryNumbers, 3);//to find the index of the value
	System.out.println(index);// if its not sorted the binarysearch will not work
	//it start in the middle, if its bigger it goes to the right, if lower goes to the left and search from there
	//just like the random number generator program
	//********************************************
	//you have to sort first
	//********************************************
	
	
}
}
