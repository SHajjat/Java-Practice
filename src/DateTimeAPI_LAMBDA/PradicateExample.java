package DateTimeAPI_LAMBDA;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate; //**********

public class PradicateExample {
	public static void main(String[] args) {
		
		//Predicate , Consumer , Supplier , Function
		
		//Predicate is an interface
		  //  <T> this is a type to be determined
		List<Integer> lst = new ArrayList<>();
		List lst2 = new ArrayList();
		Predicate <Integer> intPred = new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				return false;
			}
		};//public interface Predicate<T> {
		//boolean test(T t); Functional interface
		Predicate <Integer> intPred2 = i -> i>1;
		
		Predicate <String > pred3 = new Predicate <String >(){
			public boolean test(String s){
				return s.contains("s");
			}
		};
		
		Predicate <String> pred5 = s -> true;
		
		Predicate <Integer> numberMoreThanTen = integer -> integer>10;
		
		
		List <Integer> lst3 = new ArrayList<>();
		lst3.add(1);
		lst3.add(9);
		lst3.add(33);
		lst3.add(11);
		lst3.add(10);
		lst3.add(3);
		
		
		for (Integer temp: lst3){
			if(numberMoreThanTen.test(temp)){ // thats how you used predicate or lembda in general
				System.out.println(temp);
			}
		}
		
		lst3.removeIf(numberMoreThanTen);//if the condition is true it will be removed **be carefull
		//and notice how we didnt have to loop through it will do it for us
		System.out.println(lst3);
		
		List<String> list = new ArrayList<>();
		list.removeIf(f->f.isEmpty());
		new Boolean(null);
		Boolean [] boo = new Boolean[2];
		boo[0] = new Boolean("1");
		System.out.println(boo[0]);
		
		
	}
}
