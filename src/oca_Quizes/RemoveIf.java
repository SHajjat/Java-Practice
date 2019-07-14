package oca_Quizes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RemoveIf {
	public static void main(String[] args) {
		String [] arr ={"hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if(arrList.removeIf(s->{return s.equals("You")|| s.length() ==3;})){
			System.out.println("removed");
			System.out.println(arrList);
		}
		System.out.println(arrList);
		
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}
}
