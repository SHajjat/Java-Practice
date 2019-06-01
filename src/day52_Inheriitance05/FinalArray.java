package day52_Inheriitance05;

import java.util.*;

public class FinalArray {
	public static void main(String[] args) {
		final int [] TEAMS = {11,11};
		 int [] notATeam ={1,2};
		System.out.println("Team1 :"+ TEAMS[0]);
		System.out.println("Team2 :"+TEAMS[1]);
		TEAMS[0] = 1;
		//TEAMS = new int [3] {1,2,3}; cant do this  which mean you cant change it a new Array
		notATeam = new int [3]; // this can be done
		
		
		final ArrayList<String> whatTheActualHell = new ArrayList<>(3);
		//whatTheActualHell.set(1,"Ssa");
		whatTheActualHell.add("A");
		
		final int [] finalNums = {23 , 66 , 44 , 11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 2;
		//but you cant do new key work
		final int a1 = 1;
		final int a2 = 2;
		final int a3 = 3;
		List <Integer> nums0 = Arrays.asList(123,2,3,3444);
		  List <Integer> nums1 = Collections.unmodifiableList(nums0); // now you cant change any of the elements
		 nums1.size();
		 // nums1.set(1,0);
		int [] nums2 = {a1 , a2 , a3};
		  nums2[0] =1; // you can still change the value which if you ask me is dumppppppp
		
		//If you combine the final keyword with the use of Collections.unmodifiableList,
		//final List fixedList = Collections.unmodifiableList(someList);
		
		
		
	}
}
