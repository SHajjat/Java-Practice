package book_CH5;
import java.util.*;
public class ArraysLinst {
	public static int a;
	
	public void a(int a){
		this.a = a;
	}

	public static void main(String[] args) {
		//int [] nums = new int [2][];
		//new Arrays().print();
		String s = "a";
		s.concat("bc");
		s.replace("a","b");
		System.out.println(s);
		String[] os = new String[] { "Linux", "Mac", "Windows" };
		System.out.println(Arrays.binarySearch(os, "Linux"));
		String race = "";
		//ArraysLinst
		loop:
		do {
			race += "x";
			break loop;
		} while (true); System.out.println(race);
	}
	void print(){
		int a = 0;
		System.out.println(a+" ");
	}
	public void nest(){
	
	}
	public int nest(int i ){
		return i;
	}
	public synchronized double nest(double i){
		return i;
	}
	
}
