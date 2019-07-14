package book_CH5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DatingGame {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		int [] num;
		num = new int [] {1,2,3,3,3,3};
		List colors = new ArrayList();
		colors.add("aaa");
		//colors.add(2,"aaa");
		//colors.remove(3);
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014 , 6,20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println("date1 = "+date1);
		System.out.println("date2 ="+date2);
		System.out.println("date3 ="+date3);
		
		
	}
}
