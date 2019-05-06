package day32_custom_Methods;
import java.util.*;
public class MethodWithReturn {
	public static int giveMe10Dollars (int money){
		if ( money <10) {
			System.out.println("Fuck you give me more than 10 cheap bastared");
			money = new Scanner (System.in).nextInt();
			giveMe10Dollars(money);
			
		}

	
	return money;
	}
	/*This method retruns int value of dollars
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int price = 10* giveMe10Dollars(new Scanner (System.in).nextInt());
		System.out.println(price);
		System.out.println(name("Samir Mahmood Hajjat"));
	}
	
	
	public static String name ( String userName) {
		
		
		
		
		return userName;
		
	}
}
