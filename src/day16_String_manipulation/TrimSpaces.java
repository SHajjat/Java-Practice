package day16_String_manipulation;

public class TrimSpaces {
	public static void main (String [ ] args) {
		String word1 = "        String Methods   ";
		word1= word1.trim();
		System.out.println(word1);
		String word2 = " ya hwedalak ya hwedalak ya hwedalak ya hweda la la leee    ";
		System.out.println(word2.trim());
		System.out.println(word2.isBlank());
	}
	

}
