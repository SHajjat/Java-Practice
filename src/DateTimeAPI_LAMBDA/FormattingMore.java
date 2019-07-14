package DateTimeAPI_LAMBDA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormattingMore {
	public static void main(String[] args) {
		LocalDateTime dateTime3 = LocalDateTime.of(1990,12,21,1,21);
		DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter MediumFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		//DateTimeFormatter LongFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		System.out.println(dateTime3);
		System.out.println(shortFormat.format(dateTime3));
		System.out.println(MediumFormat .format(dateTime3));
		//System.out.println(LongFormat.format(dateTime3));
		LocalDate nowDate = LocalDate.now();
		//System.out.println(MediumFormat.format(nowDate));
		
		LocalDateTime now = LocalDateTime.of(1990,10,20,21,20);
		System.out.println(MediumFormat.format(now));
		
		LocalDate myBday = LocalDate.of(1990,10,20);
		DateTimeFormatter custom = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		System.out.println(custom.format(myBday));
		
		DateTimeFormatter custom2 = DateTimeFormatter.ofPattern(" dd MMMM , yyyy hh:mm");//two MM short MMMM long date
		LocalDateTime now4 = LocalDateTime.now();
		System.out.println(custom2.format(now4));
		
		DateTimeFormatter custom3 = DateTimeFormatter.ofPattern("dd MM,yyyy");
		//to tell which one is min and month month is always capital
		LocalDate today = LocalDate.parse("07 06,2019",custom3);
		System.out.println(custom.format(today));//so you can filp formating like this
		
		DateTimeFormatter hourPars = DateTimeFormatter.ofPattern("hh_mm");
		//LocalTime timeParser = LocalTime.parse("01_23",hourPars);
		//System.out.println(timeParser);
		
		
	}
}
