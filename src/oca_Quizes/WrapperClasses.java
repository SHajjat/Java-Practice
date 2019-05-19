package oca_Quizes;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	public static void main(String[] args) {
		//all Wrapper classes need to be declared with new (class type ) ();
		//constructors or intValue() type methods for the exam because autoboxing has removed the need for them (see the next section).
		// You might encounter this syntax on questions that have been on the exam for many years.
		// However, you just need to be able to read the code and not look for tricks in it.
		//The parse methods, such as parseInt(), return a primitive, and the valueOf() method returns a wrapper class
		
		//the Character class doesn’t participate in the parse/ valueOf methods.
		// Since a String is made up of characters, you can just call charAt() normally.
		
		//example
		// to primitive          to Wrapper
		//Integer.parseInt("1"); Integer.valueOf("2");
		
		Integer wrapper = Integer.valueOf("1");
		int prim = Integer.parseInt("1");
		System.out.println("Wrapper : "+wrapper+ " Primative : "+ prim);
		Long primLong = Long.parseLong("214343242342883423");
		long WrappLong = Long.valueOf("2143432423423423"); // you can mix and match but you have to know what it gives you, autoboxing is awsome
		System.out.println("primLong : "+primLong+ " WrappLong : "+ WrappLong);
		//In real coding, you won’t be so concerned which is returned from each method due to autoboxing.
		//but for exam you need to know valueOf() returns Wrapper, Long.parseLong() return primative
		
		
		// unboxing a null
		//you can do this
		List <Integer> nuller = new ArrayList<>();
		nuller.add(null);
		//but the next thing will give you NullPointerException since you cant unbox null
		
		//int h = nuller.get(0);   // NullPointerException
		
		//Java tries to get the int value of null. Since calling any method on null gives a NullPointerException,
		// that is just what we get. Be careful when you see null in relation to autoboxing.
		
	}
}
