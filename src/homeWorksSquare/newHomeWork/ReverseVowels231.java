package homeWorksSquare.newHomeWork;

import OCA.Testing.StringBuilderS;

import java.util.Arrays;

public class ReverseVowels231 {
	public String reverseVowels(String str) {
		
		String [] arr = str.split("");
		
		int index = arr.length-1;
		for (int i = 0 ; i<arr.length/2+1;i++){
			if(isAVowel(arr[i])){
				for(int j = index ; j>i;j--){
					if(isAVowel(arr[j])){
						childSwap(i,j,arr);
						index = j-1;
						break;
					}
				}
			}
			
			
		}
		String str2 = "";
		for(String temp:arr ){
			str2+=temp;
		}
		
		return str2;
	}
	
	private static boolean isAVowel(String s){
		String vowels ="aeiouAEIOU";
		
		return vowels.contains(s);
	}
	private static void childSwap(int  one , int two , String [] tempList){
		String temp =tempList[one];
		tempList[one] = tempList[two];
		tempList[two] = temp;
	}
	
	public static void main(String[] args) {
		ReverseVowels231 a = new ReverseVowels231();
		System.out.println(a.reverseVowels("hello world"));
	}
	
}
