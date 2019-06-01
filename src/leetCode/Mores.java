package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Mores {
	public static void main(String[] args) {
		String[] words = {"gig"};
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z"};
		
		String[] lettersToMorse = new String[words.length];
		int j = 0;
		for ( int i = 0; i < words.length; i++ ) {
			lettersToMorse[i]="";
			while (!words[i].isEmpty()) {
				if ( ("" + words[i].charAt(0)).equalsIgnoreCase(letters[j]) ) {
					lettersToMorse[i] += morse[j];
					words[i]=words[i].replaceFirst("" + words[i].charAt(0), "");
					j = 0;
				} else {
					j++;
				}
			}
		}
		System.out.println(Arrays.toString(lettersToMorse));
		int i=0 , counter = 0;
		for (String word : lettersToMorse){
			i++;
			for(int k =i ; k<lettersToMorse.length;k++){
				if(word.equals(lettersToMorse[k])){
					lettersToMorse[k]="";
					
				}
				
			}
			
		}
		for(String word :lettersToMorse){
			if(!word.isEmpty()){
			
			}
		
		}
		
		
		
	}
}
