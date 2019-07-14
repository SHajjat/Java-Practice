package Exceptions;

import java.io.IOException;

public class ThrowingException {
	/*
	create a method called reverse
	take one String as a parameter
	retrun reversed String
	inside method first check whether the argument passed is null
	if its null programmatically throw a nullPointertException
	reverse the String and return it from the method
	put the code in try catch blockl
	call your method woith valid String and null 2 times
	 */
	public static String reverse(String str){
		throw new Error();
//		String rts="";
//		try{
//			if(str ==(null)){
//				throw new NullPointerException();
//			}else{
//				for (int i = str.length() ; i>0 ;i--){
//					rts+=str.charAt(i);
//
//
//				}
//			}
//		}catch (NullPointerException e){
//			System.out.println("fuck you for passing a null");
//		}finally {
//			System.out.println("Fuck you anyway");
//		}
//		return rts;
	}
	
	public static void main(String[] args) {
		reverse("1");
	}
}
