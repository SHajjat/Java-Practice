package oca_Quizes.oca_LamdaExample;

import java.util.Arrays;

 class Gorilla {
	public Gorilla(String ... b){
		System.out.println("Varargs");
	}
//	public Gorilla(String [] a){
//		System.out.println("No");
//	}
	
	public static void main(String ... args ) {
		
		
		StringBuilder[] whateva = new StringBuilder[]{new  StringBuilder("SASA"), new  StringBuilder("SASA"), new  StringBuilder("SASA")};
		Gorilla g = new Gorilla();
		
		for (final StringBuilder temp : whateva ) {
			temp.append("1");
			//temp = new StringBuilder();
		}
		System.out.println(Arrays.toString(whateva));
	}
}
