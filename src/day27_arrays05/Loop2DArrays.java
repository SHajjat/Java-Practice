package day27_arrays05;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String [] pizzas [] = {
				             {"pinespple", "prpprtoni"} ,//0, 
			                  {"anchovies", "mushroom", "olives"},//1
		                      {"4 cheese"},//2
		                      {"Chicken", "tomatoes", "japalenios", "onions"},//3
		                      {"green peppers","zuccini","brocolli","spanach","shrimp"}//4
		                      };
		
		                                 
		     System.out.println(Arrays.toString(pizzas[1]));                  
		      
		     for (String [] pizza : pizzas) {
		    	 System.out.print(pizza.length+" - ");
		    	 System.out.println(Arrays.toString(pizza));
		     }
		     System.out.println("***********************");
		     for (int i = 0 ; i < pizzas.length ; i++) {
		    	 System.out.print(pizzas[i].length+" - ");
		    	 System.out.println(Arrays.toString(pizzas[i]));
		    	 }
		     
		     
		     
		     for (String topping : pizzas[4]) {
		    	 System.out.print(topping+", ");
		    	 
		     }
		     System.out.println();
		     System.out.println("**********");
		     
		     int [] students [] = { 
		    		               {4 , 5 , 6},
		    		               {12 , 5 , 7},
		    		               {25 , 55 , 12 , 55 , 3}
		                           };
		     
		     for (int [] outer : students) {
		    	 for (int inner : outer) {
		    		 System.out.print(inner + ",");
		    	 }
		    	 
		     }
		     System.out.println();
		     System.out.println("**********************");
		     
		     
		     int nums [][] = {
		    		           {10,20},//0
		    		           {10,30,40,50},//1
		    		           {100,200,400},//2
		    		           {555,333,111,444,666,78},//3
		    		           
		                      };
		     
		     for (int i = 0 ; i<nums.length;i++) {
		    	 for (int j = 0 ; j < nums[i].length;j++) {
		    		System.out.print(nums[i][j]+" "); 
		    		 	 
		    	 } 
		    	 System.out.println();
		    	 
		     }
		     
		     
		     }
		                                 
		                                 
		}     
	

	


