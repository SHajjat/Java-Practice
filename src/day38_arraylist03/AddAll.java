package day38_arraylist03;
import java.util.*;
public class AddAll {

	public static void main(String[] args) {
		List < String > l1 = new ArrayList <>();
		l1.add("Java");
		l1.add("python");
		
		List < String>l2 = new ArrayList<>();
		l2.add("C#");
		l2.add("C++");
		System.out.println(l1);
		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		l2.add(l2.size(),"Test");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		

	}

}
