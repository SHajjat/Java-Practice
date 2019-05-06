package day16_String_manipulation;

public class Concat {
	public static void main (String [ ] args) {
		String word = "java";
		System.out.println(word.concat(" is fun"));
		System.out.println(word.concat(" ").concat(word));
		System.out.println(word);
		word = word.concat(" eclipse");
		System.out.println(word);
		System.out.println(word.valueOf(1));
		word = word.valueOf("man" + " woman");
		System.out.println(word);
		//System.out.println(word.concat(123)); concat method only take stirngs no other types
		
		
		
		String word2 = "Hi";
		word2 = word2.concat("-hey").concat(" how are you").concat(" what man what what you want");
		System.out.println(word2);
	}

}
