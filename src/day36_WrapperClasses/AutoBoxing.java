package day36_WrapperClasses;

public class AutoBoxing {
	public static void main(String[] args) {
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		Boolean boo1 = true;
		//Autoboxing is coverting from primitive to Wrapper Class object
		//Primitive ----> object
		
		
		//Unboxing : convert object to primitive 
		//convert Wrapper class object in to primitive
		
		Boolean b1 = new Boolean (true);
		boolean b2 = b1;
		
		
		Double d1 = new Double (100.1);
		double d2 = d1;
		System.out.println("d1 "+d1);
		System.out.println("d2 "+d2);
		int d3 = new Integer (5);
		long l1= new Long (3220020204552l);
		System.out.println(l1);
		
		Integer num3 = Integer.valueOf(345);
		//doube d2=num3; cant convert from Integer to double
		Double doub2 = new Double (num3);
		//Integer num4 = new Integer (doub2);
		
	}

}
