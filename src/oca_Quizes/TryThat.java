package oca_Quizes;

import day23.Arrays;
import day37_ArrayList.ArraysAsList;

import java.util.ArrayList;

public class TryThat {
	private TryThat(){
	
	}
	private TryThat(int i){
	
	}
	public static void main(String[] args) {
		int [] stack = {10,20,30};
		int size =3;
		int idx = 0;
//		while (idx<=size-1){
//			idx++;
//		}
		System.out.println("the top elemet : "+ stack [idx]);
		
		ArrayList<Integer> points = new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(null);
		points.remove(Integer.valueOf(2));
		System.out.println(points);
		
		
		
	}
	
	int method;
	public void method(){
	
	}
	
}
