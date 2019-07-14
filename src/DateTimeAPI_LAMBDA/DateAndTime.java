package DateTimeAPI_LAMBDA;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
they have private constructors so you cant use new keyword
thats why we use of method
**there is a class called month with all months of they year implements TemporalAccessor and templorAdjustor
LocalDate and local time have the static method called of
Period can not be changed , if you chain it it will compile with error and give the last chain

Minus and plus method take Period
 *///notes
public class DateAndTime {
	public static void main(String[] args) {
		LocalDate someDate = LocalDate.of(1996, 5, 21);
		LocalDate otherDate = LocalDate.of(1996, Month.MAY, 21);
		System.out.println(someDate);
		System.out.println(otherDate);
		LocalTime someTime = LocalTime.of(21, 1, 2);
		LocalTime otherTime = LocalTime.of(12, 21, 21, 22);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.of(1990, Month.OCTOBER, 20));// this use class Month
		System.out.println(LocalDate.of(1990, 10, 20));
		
		LocalDateTime dateTime = LocalDateTime.of(1990, 12, 21, 1, 1, 1);
		dateTime = LocalDateTime.of(1990, Month.OCTOBER, 1, 2, 1, 1, 2);
		System.out.println(dateTime);
		
		LocalDateTime rightNow = LocalDateTime.of(2018, Month.FEBRUARY, 11, 11, 35, 29, 111);
		LocalDateTime rightNow2 = LocalDateTime.of(someDate, otherTime);
		
		
		LocalDateTime twoYearsLate = rightNow.plusYears(2);
		LocalDateTime threeweeksLater = rightNow.plusDays(2);
		
		LocalDate ocaExam = LocalDate.now().plusDays(8).plusYears(1);
		System.out.println(ocaExam);
		ocaExam.minusYears(1);// looks like its immutable
		System.out.println(ocaExam);
		LocalTime classTime = LocalTime.now().plusHours(2);
		LocalDateTime dateTime2 = LocalDateTime.of(1990, Month.OCTOBER, 3, 4, 4);
		System.out.println(dateTime2.plusDays(1).plusYears(1));
		LocalDateTime now = rightNow.minusMonths(3);
		
		Period p = Period.ofYears(1).ofMonths(2).ofDays(13);
		System.out.println("this what period chaining will give " + p);//P13D
		
		Period giveYearsNotDate = Period.of(1, 2, 3);
		//you cant add Period to time, it only work with date
		
		LocalDate twoMonthsAnd5Days = LocalDate.now();
		twoMonthsAnd5Days = twoMonthsAnd5Days.plus(Period.of(0, 2, 5));
		System.out.println(twoMonthsAnd5Days);
		twoMonthsAnd5Days = twoMonthsAnd5Days.minus(Period.of(0, 2, 5));
		System.out.println(twoMonthsAnd5Days);
		
		LocalDate now2 = LocalDate.now();
		Period p1 = Period.ofMonths(2).ofDays(5);
		System.out.println(now2.plus(p1));
		System.out.println(LocalDate.of(1, 2, 3));
		System.out.println(LocalDateTime.of(1, 2, 3, 4, 5));
		
		
		LocalDate today = LocalDate.of(2019, 2, 3);
		LocalDateTime dateTime3 = LocalDateTime.of(1990, 12, 21, 1, 21);
		System.out.println(today);
		DateTimeFormatter dateFormater1 = DateTimeFormatter.BASIC_ISO_DATE;//formater
		DateTimeFormatter dateFormater2 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter dateFormater3 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter dateFormater4 = DateTimeFormatter.ISO_WEEK_DATE;
		System.out.println(dateFormater1.format(today));
		System.out.println(dateFormater2.format(today));
		// Unsupported field: HourfOfDay
		System.out.println(dateFormater4.format(today));
		System.out.println(dateFormater3.format(dateTime3));
		//LocalDate date3 = LocalDate.parse("2014-06-10",DateTimeFormatter.BASIC_ISO_DATE);
//		date3 = date3.plusYears(1);
//		System.out.println(date3);
		StringBuilder sb = new StringBuilder("ABCDEFGHIJK");
		System.out.println("*****" + sb.toString() +"****");
		System.out.println("".equals(sb.toString()));
		sb.delete(1,2);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println("OCA "+ 10 ==2 +"");
		
		Integer var = 7;
		switch(var) {
			
			case 7:
				
				System.out.println("Lucky no. 7");
				
				break;
			
			default:
				
				System.out.println("DEFAULT");
				
				
			
			
		}
		
	}
		
		
	}
	

