package day42_encapsulation;
import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name = "COWBOY";
		String [] ings = {"onion crisps" , "american cheese" , "pickles" , "lettuce" ,"b7 sauce"};
		burger1.ingredients =ings;//reassgining memory location to public String ingredients
		System.out.println("burger name " +burger1.name+" ingrediants "+Arrays.toString(burger1.ingredients));
		//printing the first ingredient
		System.out.println(burger1.ingredients[0]);
		//printing all ingredients using a loop
		
		for (String temp : burger1.ingredients) {
			System.out.println(temp);
			
		}
		

	}

}
