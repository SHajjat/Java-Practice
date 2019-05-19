package oca_Quizes;

import java.util.*;

public class CovertingBetweenArrayAndList {
	public static void main(String[] args) {
		List <String> list = new ArrayList <>();//ArrayList knows how to convert itself to an array.
		list.add("hawk");
		list.add("robin");
		Object [] objectArray = list.toArray(); //casting from String to object and converting from list to Array
		System.out.println(objectArray.length);// length is 2 since we added too items
		String [] stringArray = list.toArray(new String [0]);// it has to be a value , you are suggesting a size if it doesnt fit
		// it create a new Array and put the list in it
		System.out.println(stringArray.length);
		System.out.println(Arrays.toString(stringArray));
		
		String [] array = {"hawk" , "robin"};
		List<String > list1 = Arrays.asList(array); // return fixed size list since the list is pointing where the array is at
		// you cant change the array so you cant change the list
		System.out.println(list1.size());// the size is 2
		list1.set(1,"test"); // [ hawk , test];
		array[0]="new";
		for (String b : array){
			System.out.print(b+ " ");
		}
		//list1.remove("test"); this will not compile since the size cant be changed
		
		//you can say
		
		List <String > list3 = Arrays.asList("one", "two");
		//list3.remove("one"); cant remove or change size
		
		//**Collections.sort(ArrayList)***
		
		
		
		
		
	}
}
