package Assesmant;

public class StringManupalation {
	public static void main(String[] args)
	{
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	public static String minVowels(String[] words)
	{
		int min = countVowels(words[0]) ;String minword =words[0];
		for(String word : words){
			if(countVowels(word)< min ||( countVowels(word)== min && word.length() < minword.length())){
				min= countVowels(word) ; minword = word;
			}
		}
		return minword;
	}
	public static int countVowels(String s)
	{
		int j = 0;
		for(int i =0 ; i<s.length() ; i ++){
			
			if(isVowel(s.charAt(i))){
				j++;
			}
		}
		return j;
		
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
				ch == 'e' ||
				ch == 'i' ||
				ch == 'o' ||
				ch == 'u';
	}
	
}

