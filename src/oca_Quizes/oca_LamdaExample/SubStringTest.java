package oca_Quizes.oca_LamdaExample;

import homeWorks.BookShelf.Book;

public class SubStringTest extends Book implements CheckTrait  {
	public static void main(String[] args) {
		String s = new String("123455");
		String a = s.substring(1,4);
		String b = s.substring(1,4);
		String c = "234";
		String d = "234";
		String f ="";
		for(int i = 1 ; i<4;i++){
			f+=s.charAt(i);
		}
		System.out.println(f);
		f = f.intern();
		System.out.println(f==c);
		System.out.println(c==a);
		System.out.println(c==d);
		
		System.out.println(a==b);
	}
}
