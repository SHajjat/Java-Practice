package day38_arraylist03;
import java.util.*;

public class RawArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();// raw type takes everything
		list.add("Staturday");
		list.add("Java day");
		list.add(100);
		list.add(true);
		list.add(234.5);
		list.add(false);
		System.out.println(list.toString());
		
	System.out.println(	list.get(0).toString().toUpperCase());
		
		
	}

}
