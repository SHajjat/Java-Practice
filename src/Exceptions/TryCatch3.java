package Exceptions;

public class TryCatch3 {
	public static void main(String[] args) {
		
		Object a ;
		Object b  = new Object();
		a = b = null;
		int c = 1;
		int d = 3;
		d=c=2;
		
		System.out.println("beginning");
		
		try{
			throw new RuntimeException();
		}catch (RuntimeException e){
			System.out.println("I caught an exception");
		}finally {
			System.out.println("finally");
			//swallowing an exception
			throw new NullPointerException();
			//throw new Exception();
			
			
		}
		
		//System.out.println(" end "); unreachable code
		
	}
}
