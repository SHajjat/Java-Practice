package oca_Quizes;

public class Equality {
	public static void main(String[] args) {
		
		//**Equality**
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); //false
		System.out.println(one == three); // true
		one.append(1);
		System.out.println(one == three);//true since they both have the same location
		// String str = one; does not compile you need to change to using .toString()
		
		String x = "Hello World";
		String y = "Hello World";
		String z = "Hello world";//small w
		System.out.println(x == y); // true
		System.out.println(y = z);//false
		
		String a = "Hello World";
		String b = " Hello World".trim();
		System.out.println(a == b);// false since strings are immutable and as soon as you change something it change the memory location
		//we don’t have two of the same String literal. Although x and z hap- pen to evaluate to the same string, one is computed at runtime.
		// Since it isn’t the same at compile-time, a new String object is created.
		
		
		String c = new String ("Hello World");
		String d = "Hello World";
		System.out.println(c == d);// false because
		//Since you have specifically requested a different String object, the pooled value isn’t shared.
	}
	
}
