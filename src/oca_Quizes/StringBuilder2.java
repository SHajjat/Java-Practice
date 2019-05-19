package oca_Quizes;



public class StringBuilder2 {
	public static void main(String[] args) {
		
		//***.substring(num,num) .charAt(num) and .length()***
		
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"),sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub+ " "+len + " "+ch);
		//for subString lenght and charAt it returns String int and char, the StringBuilder class is not touched
		
		
		
		//***.Append("")****
		//StringBuilder append(String str);
		StringBuilder sb2 = new StringBuilder().append(1).append('c').append("-");
		sb2.append(true);
		System.out.println(sb2); //1c-true so it treat true like a string and conct it to the StringBuilder
		
		sb2.insert(1,'d');
		System.out.println(sb2);
		
		//**insert("")**
		StringBuilder sb3 = new StringBuilder("animals");
		sb3.insert(7,"-"); // sb = animals-
		sb3.insert(0,"-"); //sb = -animals-
		sb3.insert(4,"-"); // sb = -ani-mals
		System.out.println(sb3);
		sb3.insert(sb3.length(),"\\");//it add one to the end of the StringBuilder
		System.out.println(sb3);
		
		//**delete() and deleteCharAt()
		// StringBuilder delete(int start, int end) StringBuilder deleteCharAt(int index)
		
		StringBuilder sb4 = new StringBuilder("Apple");
		sb4.delete(1,2);
		System.out.println(sb4);//its deletes 1 and doesnt delete 2
		System.out.println(sb4.deleteCharAt(2)); // throws an exception if StringIndexOutOfBoundsException.
		// for example .deleteCharAt(5);
		
		
		
		//**reverse()**
		//StringBuilder reverse()
		StringBuilder sb5 = new StringBuilder("ABC");
		sb5.reverse();
		System.out.println(sb5);// it will reverse it to CBS reverse reverse reverse (dont worry just practecing the Syntex
		
		
		//*** toString()
		// String toString()
		
		StringBuilder sb6 = new StringBuilder("mama");
		String str1 = sb6.toString();
		
		//testing 123
		String abc = new String ("abc");
		StringBuilder abcd = new StringBuilder(abc);
		abcd.append("d");
		System.out.println("StringBuilder "+abcd);
		abc = abcd.toString();
		System.out.println("String "+abc);
		
		StringBuffer samoo = new StringBuffer("abc");
		System.out.println(samoo);
		samoo.append("d");
		System.out.println(samoo);
		
		
		
		
		}
}
