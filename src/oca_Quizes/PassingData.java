package oca_Quizes;
//import java.util.*;

public class PassingData {
	public static void main(String[] args) {
		int num = 4 ;
		newNumber(num);
		System.out.println(num);
		StringBuilder string = new StringBuilder("Samir");
		addToString(string);
		System.out.println(string);
		
	}
	public static void newNumber ( int num){
		num = 8;// due to num being capculated inside the method , it doesnt matter if they have the same name
	}
	public static void addToString (StringBuilder s){
		s.append(" hajjat");
	}
}
