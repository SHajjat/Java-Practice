package day24;

public class SplitSentence {

	public static void main(String[] args) {
		
		int counter =0;
		String sentence = "Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible.";
		String reversedWord ="";
		String [] words = sentence.split(" ");
		for (String str : words) {
			System.out.println(str);
			
		}
		for (int i =words.length-1;i>=0;i--) {
		    reversedWord+=words[i]+" ";
			
	}
		System.out.println(reversedWord);
		
		String [] newWords = sentence.split(" ,");
		for (String newWords1 : words) {
			System.out.println(newWords1);
		}
		
		//find location of language;
		
		String [] words3 = sentence.split(" ");
		for (String str : words3) {
			if (str.equals("language"))
				break;
			counter++;
		}
			System.out.println("the Location of language "+counter);
		
}
}

