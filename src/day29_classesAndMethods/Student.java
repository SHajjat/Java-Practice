package day29_classesAndMethods;
import day31_Methods.Calculator;
public class Student {
	public static void main(String[] args) {
		int a = 0 ;
		study();//you have to put parentheses 
		whatToSay();
		int b = howAreYou(a);
		coding();
		System.out.println(b);
		
	}
	
	
	public static void study() {
		
		for (int i = 0 ; i<5 ;i ++ ) {
			if (i >1 && i <3)
		
		System.out.println("Student is studying");
		}
	}
	
	//creat a method say hello
	public static void whatToSay () {
		System.out.println("Hello Friends");
	}
	
	public static int howAreYou (int a) {
		  a =1;
		System.out.println("How Are you today");
		return a;
	}
	
	//creat method called code
	//inside code method student is coding java
	public static void coding() {
		
		
		System.out.println("inside code method student is coding java");
	}

}
