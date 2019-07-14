package Exceptions;

public class TryCatch2 {
	public static void main(String[] args) {
		
		System.out.println(reverse("SASSASA"));
//		try {
//			System.out.println(6 / 0);
//
//			//ArithmeticException e = new ArithmeticException();
//			//thorw keyword is used to throw an exception programmatically
//		} catch (ArithmeticException e) {
//			e.getMessage();
//		}
	}
	/*create method called reverse
	take one String as a parameter
	retrun reversed String
	inside the method check whether the argument passed is null if it's null programatically throw
	NullPointException
	put the code in try catch
	 */
	static public String reverse(String str){
		String rts = "";
		StringBuilder sb = new StringBuilder();
		sb.reverse().toString();
		try{
			if ( str == null ) {
				throw new NullPointerException();
			}else {
				for ( int i = str.length() - 1; i > 0; i-- ) {
					rts += str.charAt(i);
				}
			}
		}catch (NullPointerException e){
			System.out.println("NullPointerException Thrown");
		}finally {
			return rts;
		}
		
		
		
		}
		
	}
	

