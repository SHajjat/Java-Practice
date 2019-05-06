package day15_StringManupalation;
import java.util.*;
public class IndexOfLoop {

	public static void main(String[] args) {
		System.out.println("enter sentence");
		String list = new Scanner(System.in).next();
		//int i = list.length()-1;
		for (int i = list.length()-1 ; i>=0 ; i--) {
			if (list.indexOf("&", i)!=-1)
			  System.out.println("there is a & " + i);
		
		}
		

	}

}
