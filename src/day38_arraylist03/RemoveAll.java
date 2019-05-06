package day38_arraylist03;
import java.util.*;
public class RemoveAll {

	public static void main(String[] args) {
		List < Integer> list1 = new ArrayList <>();
		list1.add(30);list1.add(345);list1.add(1);
	    
		List < Integer> list2 = new ArrayList <>();
		list2.add(30);list2.add(345);list2.add(1);
		list2.add(12);list2.add(22);list2.add(12);
		list2.add(120);
		list2.removeAll(list1);
		list2.addAll(list2);
		System.out.println(list2);

	}

}
