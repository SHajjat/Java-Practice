package homeWorks;
import java.util.*;
public class ShoppingList2 {

	

//Lemons
//2.3
//yes
//Oranges
//6
//no
//	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		do{
		  System.out.println("Enter Item1 and its price:");
		  item = scan.next();
		  price = scan.nextInt();
		  shoppingListReport += "Item"+count+": "+item+" Price: "+price;
		  totalPrice+=price;
		  System.out.println("Add one more item?");
		  countinue = scan.next();
		  count++;
		  if(!countinue.equalsIgnoreCase("no") && count <=10)
		  shoppingListReport+=", ";
		}while(!countinue.equalsIgnoreCase("no") && count <=10);
		System.out.println(shoppingListReport);
		System.out.println(" Total price: "+totalPrice);

	}

}
