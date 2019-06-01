package day52_Inheriitance05;

public class SubObject extends Object {
	public static void main(String[] args) {
		//object is extended to all java classes , so no class will not have object and object methods even
		// if it doesnt directly ectend it
		// if a class doesnt extend any class java will automatically extend object to it
		// if it extend class the super class is extended to Object
		//and so fucking on
		SubObject sb = new SubObject();
		sb.toString(); // it comes from Object class and can be override this method in our custom class . it is used to decribe
		//the object in a string format
		sb.equals(sb);
		
		/*
		what is the differance between == and equals();
		== operator checks if both are pointing to same object in memory and return boolean
		equals() compares data or values in the object and returns boolean
		we can override equals method in our custom classes so that we can compare values between Objects
		
		if we do not over ridde equals method then it will act same like == oporator , it will only check for memory location
		 */
		
	}
}
