package leetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Roman {
	public static void main(String[] args) {
		String n1994 = "M";
		System.out.println("The year is : " + romanToInt(n1994));
		
		String n58 = "LVIII";
		System.out.println("The year is : " + romanToInt(n58));
		
		String n2015 = "MMXV";
		System.out.println("The year is: " + romanToInt(n2015));
	}
	// method that will accept a String of Roman Numbers and will convert it
	public static int romanToInt(String s) {
		char[] rLetters = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] rInts = { 1, 5, 10, 50, 100, 500, 1000 };
		char[] rTemp = s.toCharArray();
		List<Integer> rList = new ArrayList<>();
		int year = 0;
		System.out.println(Arrays.toString(rTemp));
		for (int i = 0; i < rTemp.length; i++) {
			for (int j = 0; j < rLetters.length; j++) {
				if (rTemp[i] == rLetters[j]) {
					rList.add(rInts[j]);
				}
			}
		}
		System.out.println(rList.toString());
		
		for (int i = rList.size()-1; i >=0 ; i--) {
			int temp = rList.get(i);
			int temp2 = rList.get(i-1);
			
			if(temp == 5 && temp2 == 1 || temp == 10 && temp2 == 1  || temp == 50 && temp2 == 10 || temp == 100 && temp2 == 10||temp == 500 && temp2 == 100 || temp == 1000 && temp2 == 100) {
				year += (temp-temp2);
				i--;
			}else {
				year += temp;
			}
			if(i == 1) {
				year += rList.get(0);
				break;
			}
		}
		
		return year;
	}
	///*
//   * I can be placed before V (5) and  X (10) to make 4 and 9.
//   * X can be placed before L (50) and C (100) to make 40 and 90.
//   * C can be placed before D (500)and M (1000) to make 400 and 900.
//   */
}


