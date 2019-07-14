package day64_Collections01;

import java.util.List;
import java.util.Vector;

//Vector:
/*
-Array based data structure/ internally uses dynamic array
-it is syncronized = thread safe
-it is mostly used in multi-threaded environment
-it is much slower than arraylist because it is thread-safe/syncronized
IQ:
Differance between ArrayList vs Vector?
ArrayList is not thread safe /Syncronized
Vector is thread safe / syncoronized
arrayList is faster than Vector
Both are implementations of list interface
Both use Array internally
Both allow duplicate values and keep ordering
 */

public class VectorExample {
	public static void main(String[] args) {
		List<String> v = new Vector<>();
		v.add("Muradil");
		v.add("notMuradil");
		v.add("Muradil");
		v.add("someMuradil");
		v.add("someMuradil");
		
		for (String w : v){
			System.out.println(w);
		}
		System.out.println(v.size());
		System.out.println(v.get(1));
		System.out.println(v.remove("someMuradil"));//remove the first one brah
		System.out.println(v);
		
	}
}
