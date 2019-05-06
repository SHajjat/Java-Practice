package day30_methods2;
import java.util.*;
public class WarmUpMethods {
	public static void five5Stars () {//if you dont have main method that means you dont want 
		//run it , so you only can run main method
		System.out.println("* * * * *");
	}
	
	/* 
	 * method name : introduce()
	 * params/args : nothing
	 * return type : void
	 * it will ask for a name and say nice to meet you
	 *it will ask for a name and say nice to meet you with name
	 */
	
	public static void interduce() {
		five5Stars(); //enter number
		System.out.println("put your name in man");
		String name = new Scanner (System.in).next();
		System.out.println("nice to meet you "+ name);
		
		
	}
	
	
	
	
	
	
public static void main(String[] args) {//main method doesnt have to be on top it has to be there
   // five5Stars();
	int i = 1;
	while (i >0) {	
	interduce();
	i--;
	}
	five5Stars();
	interduce();
	five5Stars();
		
		
		
	}

}
