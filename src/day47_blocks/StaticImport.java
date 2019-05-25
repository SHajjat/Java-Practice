package day47_blocks;
import static java.lang.Math.*;// you have to go to the method level
import static java.lang.Character.*;
import static java.util.Arrays.sort;
import static java.time.LocalDateTime.now;
import java.util.*;
public class StaticImport {
	public static void main(String[] args) {
		System.out.println(PI);// Pie
		System.out.println(max(10,4));//will return 10
		System.out.println(max(10,10));
		System.out.println(abs(10-1110));
		System.out.println(floor(3.45));
		System.out.println(round(45.99));
		System.out.println(round(15.5));
		System.out.println(round(15.49999));
		System.out.println(pow(10.4 , 2));
		System.out.println(random()*100);
		
		System.out.println(isDigit('4'));
		System.out.println(isAlphabetic('a'));
		System.out.println(isLetter('a'));
		
		
		int [ ] nums = {35 ,43 ,45 ,54 ,33 ,22 ,44 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(now());
	}
}
