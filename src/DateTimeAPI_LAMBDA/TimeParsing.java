package DateTimeAPI_LAMBDA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TimeParsing {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014,06,20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		System.out.println(sb.toString().equals(s));
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.append("d");
		sb.delete(0,sb.length());
		sb.append("Empty");
		String sbs =sb.substring(0,2);
		System.out.println(sbs);
		System.out.println(sb);
		List<String> list =new ArrayList<>();
		list.add("A");
		System.out.println("*******"+list.remove("A"));
		System.out.println();
	}
}
