package day24;

import java.util.Arrays;

public class CarShow {
	public static void main(String[] args) {
	//"BMW" , "Audi", "Honda" , "Mercedes" , "Mercury" , "Rolls-Royce" , "Tesla , "Ford" "
	//1.step create an array of Strings , on store these cars inside the array
	//2. step : print car names that start m
	
	
	
	String []cars= {"BMW" , "Audi" , "Honda" , "Mercedes" , "Mercury" , "Rolls-Royce" , "Tesla"  , "Ford"}; 
	for (String carNow : cars) {
		if (carNow.toLowerCase().startsWith("m"))
		System.out.print(carNow+"\t");
	}
	System.out.println();
	System.out.println("*************");
	
	//3. step : print all cars the have letter r somwhere in the name, case insensitive
	for (String carNow : cars) {
		if (carNow.toLowerCase().contains("r")) {
			System.out.print(carNow+"\t");
		}
	}
	for (String carNow : cars) {
		for (int i = carNow.length()-1 ; i>0;i--) {
			if ( carNow.charAt(i)=='a') {
				System.out.println(carNow);
				break;
			}else {
				break;
			}
		}
	}
	
	for (String carNow : cars) {
		if (carNow.length()>=6) {
			System.out.print(carNow+" ");
		}
	}
	
	//swap first and last value for array
	String carSwap = cars [cars.length-1];
	cars[cars.length-1]=cars[0];
	cars[0]= carSwap;
	
	System.out.println();
	//we want to find the postion of ford
	Arrays.sort(cars);
	System.out.println("posstion " +Arrays.binarySearch(cars,"Ford"));
	System.out.println(""+Arrays.deepToString(cars));
		

}}


