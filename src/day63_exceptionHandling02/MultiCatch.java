package day63_exceptionHandling02;

public class MultiCatch {
	public static void main(String[] args) {
		try{
//
			int[] n = {10,4};
			System.out.println(n[3]);
		
		}catch (ArithmeticException a){
			System.out.println(a.getMessage());
		
		}catch (NullPointerException n){
			System.out.println(n.getMessage());
		}catch (RuntimeException r){
			System.out.println(r.getClass().getSimpleName());
		
		}
	}
}
