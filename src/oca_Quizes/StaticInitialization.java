package oca_Quizes;

public class StaticInitialization {
	private static final int NUM ;
	static { // this is a static initializer
		int num1 = 10;
		int num2 = 50;
		NUM = num1+num2;
	}
	private static int one;
	private static final int two;
	private static final int three =3;
	//private static final int four; it was never intialized inside the initalizer
	static {
		one =1;
		two=2;
		// three = 3; doesnt compile since after the static intializer start the final value is reassigned
		//two = 4;  cant change the final value inside the intializer
		
		
	}
}
