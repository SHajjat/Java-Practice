package day36_WrapperClasses;

public class WrapperClasses {
	public static void main(String[] args) {
		int n1 = 10 ; 
		
		@SuppressWarnings("deprecation")
		Integer n2 = new Integer (100);
		
		System.out.println(n1);
		System.out.println(n2);
		
		double d1 = 44.5;
		Double d2 = new Double (123);
		System.out.println(d2.isNaN());
		Double d3 = new Double ("5.2");
		System.out.println(d1 + "\n"+ d2 + "\n"+d3);
		System.out.println(d1+d2+d3);
		
		
		char ch1 = 'a';
		Character ch2 = new Character ('b');
		System.out.println(ch1 + "\n"+ch2);
		
		
		byte b1 = 100 ;
		Byte b2 = new Byte ((byte) 10);//when you put a number it take it as a int so you have to cast
		Byte b3 = new Byte ("-55");
		System.out.println(b1 + "\n"+ b2 + "\n"+b3);
		System.out.println(b1+b2+b3);
		
		
		Integer num1 = Integer.valueOf(1234);//another way to assign
		Boolean boo1 = Boolean.valueOf(true);
		Boolean boo2 = Boolean.valueOf("False");
		Boolean boo3 = Boolean.valueOf(3>2);
		System.out.println(boo1+"\n"+boo2+"\n"+boo3);
		
		Integer i = 123; // it will take it and make it to an object new Integer(1234);
				
	}
	

}
