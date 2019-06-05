package day42_encapsulation;

import java.util.*;

public class Starbucks {

	// declare an array that can store 3 Coffee objects
	// int [] nums = new int [2];
	// String [] str = new String [2]
	// str[0]="java";

	public static void main(String[] args) {
		// declare coffeeA that can store 2 coffee objects
		Coffee[] coffeeA = new Coffee[2];
		//create coffee object in index 0 
		coffeeA[0] = new Coffee();
		//access coffee object in index 0 and set data
		coffeeA[0].setCoffeeInfo("Expresso", "tall", 2.55, 7);
		//access coffee object in index 0 and call method getCoffeeInfo
		coffeeA[0].getCoffeeInfo();

		//create a single object first
		Coffee latte = new Coffee();
		
		latte.setCoffeeInfo("Caffee Latte", "Tall", 3.85, 190);
		//assign the latte object to index 1 of the array
		coffeeA[1] = latte;
		
		//print data from object to index 1
		coffeeA[1].getCoffeeInfo();

	}

}
