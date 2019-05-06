package day36_WrapperClasses;
import java.util.*;
public class MyCities {
	public static void main(String[] args) {
		ArrayList <String> cities = new ArrayList <>();
		cities.add("Mafrak");
		cities.add("Barnaul");
		cities.add("Amman");
		cities.add("Amman");
		cities.add("Irbid");
		cities.add("zarka");
		cities.add("Mafrak");
		cities.add("Amman");
		
		
		for (String city : cities) {
			System.out.print(city+ " ");
		}
		System.out.println();
		for (int i = 0 ; i<cities.size();i++) {
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
		
		System.out.println(cities.remove("Amman"));//it will remove the first one only
		System.out.println(cities);
		cities.add(7, "Irbid");//add irbid to index 7
		System.out.println(cities);
		cities.add(2,"Seoul");
		int idx = cities.indexOf("zarka");
		
		cities.set(idx, "fairfax");
		System.out.println(cities);
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("Empty ? "+empty);
	}

}
