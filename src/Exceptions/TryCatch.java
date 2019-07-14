package Exceptions;

public class TryCatch {
	
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		Object o = new Object();
		try{
			//System.out.println(i/j);
			//String str = (String)o;

		}catch(ArithmeticException e){
			System.out.println("Cant divide by zero");
		}
		
		try{
			String str0 = (String) o;
			System.out.println(i/j);
			String str = (String)o;
		}catch (Throwable e){
			System.out.println("whats up Throwable");
		}
		
		try{
			String str0 = (String) o;
			System.out.println(i/j);
			String str = (String)o;
		}catch (Throwable e){
			System.out.println("whats up Exception");
			System.out.println("***e"+e.fillInStackTrace());
			System.out.println("*****"+e.getMessage());
		}
		
		try{
			String str0 = (String) o;
			System.out.println(i/j);
			String str = (String)o;
		}catch (RuntimeException e){
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			
			System.out.println("whats up RunTimeExceptiom");
		}
		try{
			String str0 = (String) o;
			System.out.println(i/j);
			String str = (String)o;
		}catch (Error e){
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			
			System.out.println("whats up RunTimeExceptiom");
		}
	}
}
