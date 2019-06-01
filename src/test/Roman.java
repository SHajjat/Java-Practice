package test;

public class Roman {
	public int romanToInt(String s) {
		int[] numbers = {1, 5, 10, 50, 100, 500, 1000};
		char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int[] romanInNumber = new int[s.length()];
		
		
		int k = 0;
		for ( int i = 0; i < s.length(); i++ ) {
			for ( int j = 0; j < roman.length; j++ ) {
				if ( s.charAt(i) == roman[j] ) {
					romanInNumber[k++] = numbers[j];
				}
			}
		}
		if ( s.length() < 2 ) {return romanInNumber[0]; }
		int result = 0;
		for ( int i = 0; i < romanInNumber.length - 1; i++ ) {
			if ( romanInNumber[i] >= romanInNumber[i + 1] ) {
				result += romanInNumber[i];
			} else {
				result += (romanInNumber[i + 1] - romanInNumber[i]);
				i++;
			}
		}
		result = (romanInNumber[romanInNumber.length - 1]) > romanInNumber[romanInNumber.length - 2]
				? result : result + romanInNumber[romanInNumber.length - 1];
		return result;
	}
	
	
}

