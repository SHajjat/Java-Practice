package day65_Collections;

import java.util.*;

public class LoopSet {
	public static void main(String[] args) {
		Set<Integer> numsSet = new HashSet<>();// set is unique values
		numsSet.add(10);
		numsSet.add(4);
		numsSet.add(332);
		numsSet.add(323);
		numsSet.add(422);
		numsSet.add(10);
		
		System.out.println(numsSet.size());
		for (int n :numsSet){
			System.out.print( n + " | ");
		}
		System.out.println();
		//Collections.sort(numsSet); cant sort using Collections
		Set<Integer> numsSet2 = new TreeSet<>();
		numsSet2.add(10);
		numsSet2.add(4);
		numsSet2.add(332);
		numsSet2.add(323);
		numsSet2.add(422);
		numsSet2.add(10);
		
		System.out.println(numsSet2.size());
		for (int n :numsSet2){
			System.out.print( n + " | ");
		}
		System.out.println();
		
		
		// cant use for loop since no index
		//forEach loop
		numsSet.forEach(n-> System.out.print(n+ " || "));
	}
	
	
}
