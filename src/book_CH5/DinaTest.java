package book_CH5;

import java.util.Objects;

public class DinaTest {
	static String dina1;
	
	
	
//		public static void doSum (int a , int b){
//			System.out.println("int "+(a+b));
//	}
//	public static void doSum (double a , double b){
//		System.out.println("double "+(a+b));
//	}
//	public static void doSum (float a , float b){
//		System.out.println("float "+(a+b));
//	}
//	public static void doSum (Integer a , Integer b){
//		System.out.println("Integer "+(a+b));
//	}
//	public static void doSum (long a , long b){
//		System.out.println("Long "+(a+b));
//	}
public static void doSum (Long a , Long b){
	System.out.println("Long "+(a+b));
}
	static  String s;
	public static void main(String[] args) {
		String s2 ="";
	Boolean b = new Boolean(null);
		System.out.println("true".equalsIgnoreCase(null));
		System.out.println(s+"Dina");
		System.out.println(s2+"dina");
		System.out.println(b);
		Boolean b2 = new Boolean("TRUe");
		System.out.println(b2);
		java.lang.Object o = new String("ABC");
		String s3 =(java.lang.String) o;
	}
}
