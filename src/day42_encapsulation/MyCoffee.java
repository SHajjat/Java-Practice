package day42_encapsulation;

import day05_math_operators.companyWarmUp;

public class MyCoffee {

	public static void main(String[] args) {
		Coffee cup1 = new Coffee();
		cup1.name = "Americano";
		cup1.size = "Grande";
		cup1.calories= 10;
		cup1.price = 4.75;
		cup1.getCoffeeInfo();
		
		Coffee cup2 = new Coffee();
		cup2.setName("Java Chip");
		cup2.size= "Venti";
		cup2.price = 5.95;
		cup2.calories = 600;
		
		cup2.getCoffeeInfo();
		
		Coffee cup3 = new Coffee();
		cup3.setName("ICE coffee");// cup3.name = "ICE coffee";
		cup3.setSize("tall");
		cup3.setPrice(2.35);
		cup3.setCalories(60);
		cup3.getCoffeeInfo();
		System.out.println("cup3 "+ cup3.name);
		
		Coffee cup4 = new Coffee();
		cup4.setCoffeeInfo("flat white", "tall", 3.95, 170);
		cup4.getCoffeeInfo();
		
		
		
		

	}

}
