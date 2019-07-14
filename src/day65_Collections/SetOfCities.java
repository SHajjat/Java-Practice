package day65_Collections;

import java.util.*;
public class SetOfCities {
	public static void main(String[] args) {
		city c1 = new city("London");
		city c2 = new city("London");
		city c3 = new city("London");
		city c4 = new city("London");
		
		Set<city> cities = new HashSet<>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		System.out.println(cities.size());//size is 4 because we dont know if they are the same object or not
		//after generating hascode and equals it will generate 1
		
		//Set interface ->Unique , unordered values.
		//When you want the set to accept only unique objects from your custom class, then we need to override equals
		//and hasCode methods.
		//equals and hashCode methods are used to find out if 2 objects are equals
		//those methods are called by Set interface internally to find out if object is unique or duplicated
		//when overriding equals and hashCode methods we can specify how to compare based on our instance variables values
		//============================================================================================================
		//hasCode method -> each object will have a unique code of type int when created, that value is returned by this method
		//============================================================================================================
		//equals method -> can be used to compare instance variable values and find out if objects are equal or no. true if equal ,false if not
		
		System.out.println(c1.hashCode());// they all have the same hashCode due to equals comparing them and deciding
		System.out.println(c2.hashCode());// they are equal to eachother
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
	}
}
