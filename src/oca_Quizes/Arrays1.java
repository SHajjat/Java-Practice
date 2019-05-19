package oca_Quizes;
import java.util.*;
public class Arrays1 {

	public static void main(String[] args) {
		int [] number1 = new int [3]; //When using this form to instantiate an array,
		// set all the elements to the default value for that type for int its 0
		
		int [] number2 = new int[] {1,2,3,4}; // without the [] it will not compile
		int [] number3 = {3,4,5,4444}; //This approach is called an anonymous array
		/*
		int[] numAnimals; All those examples are legal
		int [] numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
		 */
		
		// ok this is importntant
		//int[] ids, types; this is two variable
		//int ids[], types; this declares one array int and types is actually int type not an array
		// isnt that cool
		
		String [] bugs = {"cricket" , "beetle", "ladybug"};
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString());// this will give hashCode [Ljava.lang.String;@6bdf28bb
		String [] copy = java.util.Arrays.copyOf( bugs , bugs.length);
		System.out.println(bugs.equals(copy));// this will check memory location
		System.out.println(bugs == copy);// false
		System.out.println(Arrays.equals(bugs, copy));// this is true
		String[] strings = { "stringValue" };
		Object[] objects = strings; //cast because Object is a broader type than String.
		String[] againStrings = (String[]) objects; // you have to cast a cast is needed because we are moving to a more specific type.
		//againStrings[0] = new StringBuilder(); doesn’t compile because a String[] only allows String objects and StringBuilder is not a String.
		
		
		//objects[0] = new StringBuilder(); // careful!
		//A StringBuilder object can clearly go in an Object[]. The problem is that we don’t actually have an Object[]
		// . We have a String[] referred to from an Object[] variable. At runtime, the code throws an
		// ArrayStoreException. You don’t need to memorize the name of this exception, but you do need to know that
		// the code will throw an exception.
		
		
		String[] stringsss = { "10", "9", "100" }; Arrays.sort(strings);
		for (String string : stringsss)
			System.out.print(string + " "); // it will do 10 9 100
		// The problem is that String sorts in alphabetic order, and 1 sorts before 9.
		// (Numbers sort before letters and uppercase sorts before lowercase,
		System.out.println();
		
		int [] [] arg = new int [4][];
		arg[0] = new int [5];
		arg[1] = new int [3];
		System.out.println(Arrays.deepToString(arg));//[[0, 0, 0, 0, 0], [0, 0, 0], null, null] since we didnt define the 3rd and 4th
		
		int [] [] twoD = new int[3][2];
		for(int i = 0 ; i<twoD.length; i++){
			for(int j = 0 ; j< twoD[i].length;j++){// pay attention to twoD[i].length
				System.out.print(twoD[i][j]+" ");
			}
		}System.out.println();
		for (int [] out : twoD){
			for(int in : out){
				System.out.print(in+" ");
			}
		}
		
		
		
		
	}
}
