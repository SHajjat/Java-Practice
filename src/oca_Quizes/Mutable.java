package oca_Quizes;
import day16_String_manipulation.BuildWord;

import java.util.*;
public class Mutable {
	StringBuilder mutableBuilder ;
	
	public Mutable(StringBuilder a ){
		mutableBuilder = new StringBuilder(a) ;// get mutableStringBuilder a new Refrrance
		
		
	}
//	public StringBuilder getmutableBuilder(){
//		System.out.println(mutableBuilder);
//		return new StringBuilder(mutableBuilder);
		
//	}
	public String getStringMutable (){
		return mutableBuilder.toString();
	}
	
	public static void main(String[] args) {
		Mutable builder = new Mutable(new StringBuilder("abc"));
//		builder.getmutableBuilder().append("DE");
//		System.out.println(builder.getmutableBuilder());
		System.out.println(builder.getStringMutable());
	}
}
