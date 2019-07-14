package day60_polym02;

import day59_polym.*;

public class InstanceOfOperator {
	public static void main(String[] args) {
		Animal a = new Tiger();
		//getClass().getName() methods
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getSimpleName());
		if(a.getClass().getSimpleName().equals("Tiger")){
			System.out.println(a.toString() +" is a Animal");
		}else{
			System.out.println(a.toString() +" is not an Animal");
		}
		
		System.out.println(a.toString()+" "+(a instanceof Animal)+" " +"Animal");
	}
}
