package Assesmant;

import java.util.Scanner;

public class wordproral {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("# in:");
		int amt = inp.nextInt();
		inp.nextLine(); //this line is necessary
		System.out.print("word:");
		String word = inp.nextLine();
		//leave the above unedited, write your code below:
		word = word.toLowerCase();
		if(word.endsWith("fe")){
			word= word.substring(0,word.length()-2)+"ves";
		}else if (word.endsWith("ch")) {
			word= word+"es";
		}else if (word.endsWith("us")){
			word= word.substring(0,word.length()-2)+"i";
		}else if(word.endsWith("y")){
			if(word.endsWith("ay") ||word.endsWith("oy") ||word.endsWith("ey") ||word.endsWith("uy") ){
				word +="s";
			}else{
				word = word.substring(0,word.length()-1)+"ies";
			}
		}else{
			word+="s";
		}
		System.out.println(word);
	}
}
