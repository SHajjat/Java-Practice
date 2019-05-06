package day11_logicalOperaters;
import java.util.*;
public class TollCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int carType ; String rushHour ; double price = 0 ;
        System.out.println("Enter Vehical Type 1 or 2");// 1 or 2
        carType = scan.nextInt();
        System.out.println("Is it rush hour : yes | no");
        rushHour = scan.next();
        //check if rushHour String is "yes" => assign true to isRushHour
        // if it is "no , assgin false to isRushHour
        boolean isRushHour ;
        if (( isRushHour = rushHour.equalsIgnoreCase("yes"))) {
       System.out.println("you fucked man");
        
        }else {
        System.out.println("your fucked but not as much man");
        
        }
        if (carType ==1 ) {
        	if(isRushHour) {
        		price = 30;
        	 }else {
        		price = 5;
        		//System.out.println("the price is "+ price);
        	 }
        }else {
        	if(isRushHour) {
        		price = 100.30;
        	 }else {
        		price = 15.99;
        	 }
        	
        }
        System.out.println("the price is "+ price); 
	}

}
