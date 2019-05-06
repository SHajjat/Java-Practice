package day08_casting_conditional;

public class CastingPrimatives {
	public static void main (String[] args) {
		int i = (int)3.4;//it will remove 0.4
		System.out.println("i : "+ i);
		double price = 230.43;
		int intPrice = (int) price;
		System.out.println("Price int : "+ intPrice);
		//whole numbers . byte ,short , int
		int count = 100;
		byte byteCount = (byte) count;
		System.out.println("byte count : "+ byteCount);
		long longValue = 532523523l;
		int intValue = (int) longValue;
		System.out.println(intValue);
		int large = 5678;
		short small = (short)large ;
		System.out.println("small :"+small);
		int result = (int) ( 500.4/2.0);
		System.out.println("compare " + 500.4/2.0 + " to " + result);
		
		byte b = 123;
		int i2 = (int) b ; //it will automaticaly cast it no need to put int its called imlicit casting
		//when you go from small to large it does it it self like byte ==>int or int===> double , short ===>long
		//explicit casting means you need to tell it to cast ===> is used when converting from larger types to smaller types
		// for example int ===> byte , double ==> int , 
		
	}

}
