package Exceptions;

public class Finally {
	public static void main(String[] args) {
		Object o = new Object();
		String s = "";
		System.exit(3);
		try{
			
			s.concat("String");
			// String str = (String) o;
		}catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}catch (NullPointerException e){
			System.out.println(e.getMessage());
		}catch (ClassCastException e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("thank you for using our program");
		}
	}
	@Override
	public boolean equals(Object o){
		return false;
	}
}
