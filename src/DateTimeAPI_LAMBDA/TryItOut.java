package DateTimeAPI_LAMBDA;

import java.util.ArrayList;

public class TryItOut {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		try{
			while(true){
				myList.add("My String");
			}
		}catch (RuntimeException e){
			System.out.println("Caught a Runtime");
		}catch (Exception e){
			System.out.println("caught an exception ");
			
		}
		System.out.println("Ready to use");
		
	}
}
