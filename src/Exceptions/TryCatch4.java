package Exceptions;

import book_CH5.ArraysLinst;

import java.util.ArrayList;

public class TryCatch4 {
	public static void main(String[] args) {
		
		
		
		ArrayList myList = new ArrayList();
		String [] myArray;
		try{
			while (true)
				myList.add("My String");
		}catch (RuntimeException e){
			System.out.println(e.getMessage());
		} catch (Exception e){
			System.out.println("caught an exception");
		}
		System.out.println("ready to use");
		
	}
}
