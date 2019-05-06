package day23;
import java.util.*;
public class CalculateSum {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 0 ; i<6 ; i++) {
			int num = new Scanner (System.in).nextInt();
			if (num <=0) {
				continue;
			}
			sum+=num;
		}
		System.out.println("the sum is "+sum);
		
	}

}
