package day38_arraylist03;
import java.util.*;
public class MethodSummary {

	public static void main(String[] args) {
		List <String> list1 = new ArrayList<>();
		//add method to add a value
		list1.add("red");
		list1.add("blue");
		list1.add("White");
		list1.add("gray");
		list1.add("black");
		
		
		//add method with index"
		list1.add(0,"yellow");
		
		//toString Method to print all values in same line
		System.out.println(list1.toString());
		
		//size method
		System.out.println("Number of elements : "+ list1.size());
		
		//get method return value from index
		
		System.out.println("value at location 0 " +list1.get(3));
		System.out.println("Value at location 3 "+ list1.get(3));
		
		//remove method using index
		
		list1.remove(0);
		System.out.println("original index zero is removed "+ list1 );
		
		//remove using value/element . removes element first appearance 
		
		list1.remove("blue");
		System.out.println("list with no blue "+list1);
		
		//set method set(index,value) replace certin index with new value
		list1.set(0, "orange");
		
		System.out.println(list1);
		
		
		//indexOf(value) . returns index of value in the list
		
		System.out.println("gray "+ list1.indexOf("gray"));
		System.out.println(("index of green :"+ list1.indexOf("green")));
		
		//is empty
		System.out.println("is list empty " +list1.isEmpty());
		System.out.println("is element in list empty "+list1.get(3).isEmpty());
		
		//contains 
		
		System.out.println("is there orange" +list1.contains("orange"));
		
		
		List <String> list2 = new ArrayList<> ();
		
		//addAll adds all values from one list in to another
		
		list2.addAll(list1);
		System.out.println("list2 : "+list2.toString());
		
		//contains All . check if list has all values of another list
		System.out.println("contains All "+list2.contains(list2));
		
		//Equals(list) Check if 2 lists are exactly equals
		System.out.println("equals " +list1.equals(list2));
		
		//remove and remove all
		list2.add("pink");
		
		list2.removeAll(list1);
		System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);
        
        //clear
        list1.clear();
        list2.clear();
        System.out.println("is empty " +( list1.isEmpty() && list2.isEmpty()));
		
		
		
		
		
		
	}

}
