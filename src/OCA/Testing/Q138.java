package OCA.Testing;

import java.time.LocalDate;

public class Q138 {
	private int doStuff(){
	
	return 0;
	}
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2012,01,31);
		date1 =date1.plusDays(10);
		System.out.println(date1);
	}
}
