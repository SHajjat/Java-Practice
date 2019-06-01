package day52_Inheriitance05;

import java.util.ArrayList;

public class ForForEach {
	public static void main(String[] args) {
		ArrayList<Integer> what  = new ArrayList<>();
		what.add(1); what.add(2);
		int j = what.size();
		for ( int i = 0 ; i<j ; i++){
			what.add(1);
		}
		System.out.println(what);
	}
}
