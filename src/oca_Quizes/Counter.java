package oca_Quizes;
import java.util.*;

import day45_encapsulation_practice.Course;

public class Counter {
	private static int count; // ins variables start at 0
	public Counter(){count++;}
	public void samir(int i){
		System.out.println(i);
	}
	private static final int ANNA = 4;
	int anaaa = ANNA;
	private static final ArrayList < String > final$$ = new ArrayList<>();
	public static ArrayList <String> notFinal$$ = new ArrayList<>();
	public static void main(String[] args) {
		Counter count1 = new Counter ();
		Counter count2 = new Counter ();
		Counter count3 = new Counter ();
		System.out.println(count);// will give you three since it was called 3 times
		count1.samir(1);
		final$$.add("samir");
		final$$.remove("ahmad");
		//final$$ = notFinal$$; cant change the location of refrance variable but you can change what is in it
		
		
		
		
		
		
	}
	
}
