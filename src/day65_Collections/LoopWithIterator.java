package day65_Collections;
import  java.util.*;
public class LoopWithIterator {
	//iterator interface - can be used to iterate through collections
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();// set is unique values
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		//1)Create Iterator object
		Iterator<Integer>  it = nums.iterator();
		
		//2) Call hasNext and next methods (Only two)
		//hasNext return true , if there is still next value
		//returns false when it reaches the end or empty
		System.out.println("it.hasNext() ->"+it.hasNext());// returns boolean , does it have next value
		System.out.println("it.next() ->"+it.next());// next method is one way it keeps until there is no more elements
		//then it gives no such elementexception
		System.out.println("it.next() ->"+it.next());
		System.out.println("it.next() ->"+it.next());
		
		//3)use a while loop
		while (it.hasNext()){
			System.out.println("it.next() ->"+it.next() + " in a while loop");
		}
	     //System.out.println(it.next()); since we looped through all the element it will give noSuchElementException
		//the only way we can go back is to create another iterator
		//diff between itrator and for each loop : in itrator you can remove a value
		
		Iterator <Integer> it2 = nums.iterator();
		/*
		when using Iterator to loop through a collection we can remove objects  while looping
		 */
		while (it2.hasNext()){
			int val = it2.next();
			if(val>3){
				it2.remove(); // when you remove from here it will remove from the list
			}
		}
		System.out.println(nums.toString());// all values over 3 were removed
		
//		for( int num : nums){
//			if (num > 3){
//				nums.remove(new Integer(num));//this will throw an exception
//			}
//		}
		List<String > cities = new ArrayList<>();
		cities.add("Amman");cities.add("Irbid");cities.add("McLean");cities.add("whatever");
		
		Iterator<String> city = cities.iterator();
		
		while (city.hasNext()){
			String myCity = city.next();
			if (myCity.equals("whatever")){
				city.remove();
			}
		}
		System.out.println("from Iterator " + cities.toString());
		
//		for ( String city : cities){
//			if ( city.equals("whatever")){
//				cities.remove("whatever");    // this will give java.util.ConcurrentModificationException
//			}
//		}
	
	}
}
