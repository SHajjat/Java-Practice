package day64_Collections01;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		/*
		liked List implements class of a List interface
		stores data in individual nodes that are connected to each other
		Each node will have a pointer to the next node
		Consists of Values connected to each other
		Implements List and Deque interfacer
		
		 */
		List<Integer> list = new LinkedList<>();
		Deque<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();
		list.add(1);
		list.add(50);
		list.add(4);
		System.out.println(list.get(1));//List
		System.out.println(list.contains(50));
		System.out.println(list.toString());
		list2.addFirst(2);list2.addFirst(3);//Deque
		System.out.println(list2);
		
		System.out.println(list3);//LinkedList
		list3.addLast(30);
		System.out.println(list3);
	}
}
