package DateTimeAPI_LAMBDA;

public class Computer {
	
	
	public static void main(String[] args) {
		
		
		Computable isEven = ( i,  j )-> i % 2 == 0 && j % 2 == 0;
		
		Computable isdivby5 = (Integer i, Integer j) -> { return i % 5 == 0 && j % 5 == 0; };
		
		System.out.println(isEven.canBeComputed(1,2));
		System.out.println(isdivby5.canBeComputed(5,5));
	}
}
