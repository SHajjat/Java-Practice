package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
	public static void main(String[] args) {
		List <String> cars = Arrays.asList("Tesla" , "Porsche", "Honda");
		List<Integer> nums = new ArrayList <>();
		System.out.println(cars);
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//create ArrayList called prices 
		//assign values using Arrays.aslist method
		
		
		List <Double> prices = Arrays.asList(10.1 ,2.3 , 4.5 , 5.6 , 7.5 , 100.2 , 30203.0);
		System.out.println(prices);
		
		
		double sum = 0 ;
		for (double price : prices) {//it will automatically unbox them from Wrapper to primative
			sum+=price;
		}
		System.out.println(sum);
		
		for (int i = 0 ; i < prices.size(); i++) {
			sum+=prices.get(i);
		}
		System.out.printf("%4.2f",sum);
		
		//create new list expensive
		//add prices that are more than 100
		ArrayList <Double> newPrices = new ArrayList <>();
		for (double price : prices ) {
			if (price >100.0) {
				newPrices.add(price);
			}
		}
		System.out.println();
		System.out.println(newPrices);
		//prices.removeAll(newPrices);
		System.out.println("Cheap prices" +prices);
		
	}

}
