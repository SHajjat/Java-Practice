package day20;

public class IndexOf {
	public static void main(String[] args) {
		String word = "amazon";
		char letter = 'z';
		int index =0;
		
		
		for (int i = 0 ; i <word.length(); i++) {
			if ( word.charAt(i) == letter) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}

}
