package oca_Quizes;
import java.time.*;
public class DateAndTime {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalTime.MAX);
		LocalDate date1 = LocalDate.of(1990,10,20);
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(Year.MAX_VALUE,Month.MAY, 10);
		
		LocalTime time3 = LocalTime.of(1,2,3,4);
		//LocalTime date3 = LocalDate.of(1990,2,3);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		System.out.println(dateTime1);
		
	
	
	}
}
