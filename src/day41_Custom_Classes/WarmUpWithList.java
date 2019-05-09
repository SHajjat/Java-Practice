package day41_Custom_Classes;
import java.util.*;
public class WarmUpWithList {
	public static List <Integer> doubleTheList(List <Integer> myArray){
		for(int i = 0 ; i<myArray.size();i++) {
			myArray.set(i, myArray.get(i)*2);
		}
		return myArray;
	}
	
	
	
	
	
	
	
  public static void main(String[] args) {
	List <Integer> myArray = new ArrayList <>(Arrays.asList(1,2,3,4,5));
	System.out.println(doubleTheList(myArray));
	List <Integer> newList = doubleTheList(myArray);//you can set List like this
	System.out.println(newList);
}    
}
