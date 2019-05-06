package day06_operators2;
import java.util.*;
public class VendingMachine {

	public static void main(String[] args) {
		 int itemPrice, quarters, dimes, nickels;
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter price in cents:");
		    itemPrice = input.nextInt();
		    
		    if ( itemPrice <=100 && itemPrice >=25 && (itemPrice % 5) == 0)
		    {
		     int change= 100-itemPrice;
		      quarters= change/25;
		      change -=quarters*25;
		      dimes= change/10;
		      change -=dimes*10;
		      nickels= change/5;
		      System.out.println("Your change is " +quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		      
		    }
		    else
		    System.out.println("Invalid price!");

	}

}
