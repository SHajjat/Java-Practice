package day24;

public class ArraysOfChars {
	public static void main(String[] args) {
		char [] values = {'a','b','c','d','e'};
		//values = {'a','b','c','d','e'}; can only assgin constant when initilizing
		String str = "Wooden spoon";
		//this , method toCharArray() converts String into array of chars;
		
		char [] chars = str.toCharArray();
		
		for( char newChar : chars) {
			System.out.print(newChar);
		}
		str="";//to empty str
		System.out.println();
		for (int i =chars.length-1; i>=0; i --) {
			//System.out.print(chars[i]);
			str+=chars[i];
		}
		System.out.println(str);
		str="";
		
		for (int i=chars.length-1; i>0;i--) {
			if (chars[i]==' ') {
				for (int j = i; j<)
			}
		}
	}

}
