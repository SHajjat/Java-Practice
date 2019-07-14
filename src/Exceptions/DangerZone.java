package Exceptions;

import day08_casting_conditional.CastingPrimatives;

public class DangerZone  {
	public static void main(String[] args) {
		System.out.println("Benginning of program");
		int i = 8;
		int j = 0;
		//System.out.println(i/j); //java.lang.ArithmeticException
		int [] arr = new int []{1,2,3};
		//System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
		System.out.println("End of program");
		
		Object o = new Object();
	//	String s =(String ) o; //java.lang.ClassCastException
		
		try{
			System.out.println(arr[3]);
		}catch (  ArrayIndexOutOfBoundsException e){
			System.out.println("The index out of bound");
		}
		
		try{
			System.out.println(i/j);
		}catch(ArithmeticException e){
			System.out.println("Cant divide by zero");
		}
		
		try{
			String str = (String) o;
			
		}catch (ClassCastException e){
			System.out.println("Uncompatable casting");
		}
		System.out.println("End of the program 2");
	}
}
