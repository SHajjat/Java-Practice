package day36_WrapperClasses;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		
		//declare arraylist called languages
		ArrayList <String > languages = new ArrayList <>(5);
		languages.add("java");
		languages.add("Arabic");
		languages.add("English");
		languages.add("Spanish");
		System.out.println(languages.size());//5
		languages.add("Turkish");
		System.out.println(languages.size());
		//languages.addAll(index, c)
		System.out.println(languages);
		languages.remove(0);
		System.out.println(languages);
		languages.remove("English");
		System.out.println(languages.remove("Arabic"));
		System.out.println(languages);
		

	}

}
