package day37_ArrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		ArrayList <String> shoppingList = new ArrayList <>();
		shoppingList.add("banana");
		shoppingList.add("mooz");
		shoppingList.add("apples");
		shoppingList.add("b6eee5");
		shoppingList.add("khara");
		shoppingList.add("makeup");
		System.out.println(shoppingList.get(0)+", "+shoppingList.get(shoppingList.size()-1));
		
		int count =shoppingList.size();
		System.out.println(count);
		
		//for eachloop can be used only for readying , you cant modify 
		for (String item : shoppingList ) {
			System.out.print(item +" ");
			
		}
		System.out.println();
       System.out.println(shoppingList);
       System.out.println(shoppingList);
       
       shoppingList.remove("banana");
       System.out.println(shoppingList);
       
       System.out.println(shoppingList.indexOf("apples"));
       //remove all items at once
       shoppingList.clear();
       System.out.println(shoppingList+ ""+shoppingList.size());
       
       
	}
	
	

}

