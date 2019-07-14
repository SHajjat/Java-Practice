package day64_Collections01;

import java.util.*;

public class SetExamples {
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();// it does not keep the order , it have mechanizem called hashing (no relation to Hash)
		mySet.add(100);
		mySet.add(200);
		mySet.add(300);
		mySet.add(400);
		mySet.add(500);
		mySet.add(600);
		mySet.add(600);
		mySet.add(600);// duplicates are ignored brah
		System.out.println(mySet);
		System.out.println(mySet.size());
		List<String> list = Arrays.asList("D", "e", "e","n","a","!");
		//System.out.println(new HashSet<>(list));
		Set <String> uniqe = new HashSet<>(list);
		//System.out.println(Arrays.sort(uniqe)); cant be used
		Set<String> herName = new TreeSet<>(list);//it orders alphabitically not keep the order
		System.out.println("Her name is " +herName);
		TreeSet<String> tSet = new TreeSet<>();
		tSet.addAll(list);
		System.out.println(tSet);
		tSet.size();
		System.out.println(tSet.ceiling("D"));
		
	}
}
