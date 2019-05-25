package homeWorks;

public class ReversingOnlyLetters {
	public static String reverseLetters(String word){
		//TODO
		String tempWord = "";
		String [] tempArr = word.split("");
		word="";
		for (int i = tempArr.length-1 ; i>=0 ; i--) {
			if ( Character.isLetter(tempArr[i].charAt(0)) ) {
				tempWord += "" + tempArr[i];
				tempArr[i] = " ";
			}
		}
			int j=0;
			for(int i = 0 ; i<tempArr.length ; i++) {
				if ( Character.isWhitespace(tempArr[i].charAt(0)) ){
					tempArr[i] = "" + tempWord.charAt(j++);
				
			}
				
				word+=tempArr[i];
				
				
			}
			
		
		
		
		return word;
	}
	
	public static void main(String[] args) {
		String word = "a,b$c";
		System.out.println(reverseLetters(word));
	}
}
