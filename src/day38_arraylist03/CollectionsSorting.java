package day38_arraylist03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {
public static void main(String[] args) {
	List < Integer> numsList = new ArrayList <>();
	numsList.add(44);
	numsList.add(1);
	numsList.add(4);
	numsList.add(1000);
	numsList.add(3);
	System.out.println("unSorted : "+numsList);
	Collections.sort(numsList);
	System.out.println("Sorted through Collections "+ numsList);
	
	List < String> strList = new ArrayList<>();
     
	strList.add("Fuad");
	strList.add("Roman");
	strList.add("Murad");
	strList.add("Muhabbat");
	strList.add("Maria");
	strList.add("Dina");
	strList.add("Bojan");
	strList.add("Anna");
	strList.add("anna");
	System.out.println(strList);
	System.out.println("Sorting ...Please wait...");
	Collections.sort(strList);
	System.out.println(strList);
	
	
	// MAX and Min
	
	System.out.println(Collections.max(numsList));
    System.out.println(Collections.min(numsList));
	
	System.out.println(Collections.min(strList));
	System.out.println(Collections.max(strList));
	
	Collections.shuffle(strList);
	System.out.println(strList);
	
	
	
	
}
}
