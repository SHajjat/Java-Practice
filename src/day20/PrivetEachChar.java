package day20;

public class PrivetEachChar {

	public static void main(String[] args) {
		
		//using for loop. print each char one by one
		//using for loop print only consonant
		//useing for loop print vowels (a,e,o,i,u)
		String word = "samir";
		
		for (int i = 0 ; i<word.length() ; i++) {
			
			
			System.out.println(word.charAt(i));
		}
		System.out.println("*********");
		
	  word = word.toLowerCase();
		for (int i = 0 ; i <word.length() ; i++ ) {
			if (word.charAt(i) == 'a' ||word.charAt(i) == 'e'||word.charAt(i) == 'o'||word.charAt(i)== 'i'||word.charAt(i) == 'u'){
			System.out.print(word.charAt(i)+", ");
			
			}

			
				
		}
		System.out.println();
		System.out.println("*********");
		for (int i = 0 ; i <word.length() ; i++ ) {
			if (!((word.charAt(i) == 'a' ||word.charAt(i) == 'e'||word.charAt(i) == 'o'||word.charAt(i)== 'i'||word.charAt(i) == 'u'))){
			System.out.print(word.charAt(i)+", ");
			
			}
		}
	}

}
