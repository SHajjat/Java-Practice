package day38_arraylist03;
import java.util.*;
public class EqualsMethod {
	public static void main(String[] args) {
		List <String> friends1 = new ArrayList<>();
		List < String> friends2 = new ArrayList<>();
		friends1.add("Ahmad");
		friends1.add("Mohammad");
		friends1.add("Abdullah");
		friends2.add("Ahmad");
		friends2.add("Mohammad");
		friends2.add("Abdullah");
		System.out.println(friends1.equals(friends2));
		String equals = friends1.equals(friends2)? "Same Friends":"differant Friends";
		System.out.println(equals);
		friends1.clear();friends2.clear();
		friends1.add("Ahmad");
		friends1.add("Mohammad");
		friends1.add("Abdullah");
		
		friends2.add("Mohammad");
		friends2.add("Abdullah");
		friends2.add("Ahmad");//changed location
		String equals2 = friends1.equals(friends2)? "Same Friends":"differant Friends";
		System.out.println(equals2);
		//it is a strict comparison size and values in each index must match for returning ture.
		
		//add all will take the first list and add a second list to it
		friends1.addAll(friends2);
		System.out.println(friends1);
	}

}
