package day38_arraylist03;
import java.util.*;
public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList < String > list1 = new ArrayList <>();
		
		list1.add("Jan");
		list1.add("feb");
		list1.add("Mar");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList <String > list2 = list1;//here they will both point same location, so they will both change
		ArrayList<String> month1 = new ArrayList <>(list1);//copying all the values form list1 , constructor
		System.out.println(month1.toString());
		month1.add("jun");
		month1.add("Jul");
		month1.add("Aug");
		System.out.println(month1.contains("Jan"));
		System.out.println(month1.contains("Dec"));
		//how would you check if Feb is in second position
		System.out.println(month1.indexOf("Feb")==1);
		System.out.println(month1.get(1).equals("Feb"));
		
		ArrayList <String> month2 = new ArrayList <>(list1);
		System.out.println("Month1 : "+ month1);
		System.out.println("Month2 : " +month2 );
		//check if month has all the values of month2
		
		System.out.println(month1.containsAll(month2));
		
		month2.add("Jan");
		System.out.println(month2);
		System.out.println(month1.containsAll(month2));
	}

}
