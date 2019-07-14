package day57_interface;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lamda {
	public static void main(String[] args) {
		//Predicate p = t -> test(t);
		Predicate < Integer>  p = t -> 5 > t;
		Electric e = i -> i+5;
		System.out.println(e.charge(1));
		
		Electric e2 = i -> {for (int f =i ; f>0 ; f--) System.out.println(f); return i;};
		System.out.println(e2.charge(3));
		
		Predicate <Integer > moreThan4 = t -> {return t > 11;};
		List<Integer> lst3 = new ArrayList<>();
		lst3.add(1);
		lst3.add(9);
		lst3.add(33);
		lst3.add(11);
		lst3.add(10);
		lst3.add(3);
		System.out.println("*************");
		for (Integer i : lst3){
			System.out.println(moreThan4.test(i));
			
		}
		lst3.removeIf(moreThan4);
		System.out.println(lst3);
		
		
		System.out.println( moreThan4 );
		
		Electric e3 = i -> {return i;};
		System.out.println(e3.charge(3));
		
		Predicate <Integer> pred1 = i -> i>3;
		
		lst3.removeIf(pred1);
		
		Electric e4 = i -> i;
		System.out.println();
		
		switch (((e).charge(2))){
			case 1:
				System.out.println("Number is "+1);
				break;
			case 2:
				System.out.println("Number is "+2);
				break;
			case 3:
				System.out.println("Number is "+3);
				break;
				default:
					System.out.println("no idea what you talking about ");
				
		}
		
	}
}
