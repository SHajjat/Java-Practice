package DateTimeAPI_LAMBDA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Immutable {
	public static void main(String[] args) {
		String str = "abc ";
		str.replace("a","d");
		System.out.println(str);
		
		LocalDate now = LocalDate.parse("2018-02-11", DateTimeFormatter.ISO_LOCAL_DATE);
		now = now.plusYears(2); //same concept with a string as if you dont assgin it it is mutable
		//now = now.plusMonths(now)
		System.out.println(now);
		
		
	}
}
