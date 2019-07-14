package Exceptions;
import java.util.Arrays;


public class MultiCatchBlocks {
	public static void main(String[] args) {
		int [] arr = new int [4];
		try{
			System.out.println(arr[5]);
			System.out.println(6/0);
		}catch (ArithmeticException a){
			System.out.println("exception");
		}catch (ArrayIndexOutOfBoundsException b){
			System.out.println("ArrayIndexOutOfBoundsException ");
			b.getMessage();
		}catch (Exception c){
			c.getMessage();
		}
		
		Object o = new Object();
		String s = null;
		try{
			s.concat("String");
			String str = (String) o;
		}catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}catch (NullPointerException e){
			System.out.println(e.getMessage());
		}catch (ClassCastException e){
			System.out.println(e.getMessage());
		}
		System.out.println(Arrays.toString(new int[3]));
		
		try {
		
		}catch (Throwable e) {
			//}catch (Object e){ you cant catch object exception
			
		}
		
	}
}
