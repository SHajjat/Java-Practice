package day11_logicalOperaters;
import java.util.*;
public class WarmUpOrAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    System.out.println(" Enter age:");
	    int age = scan.nextInt();
	    int ages[] = {2 , 3 , 5 , 6 ,7, 8 ,10 , 11 ,12, 13, 14 , 16 , 17 , 18};
    //    String lables [] = { " ineligible", " toddler", " early childhood", " young reader", 
//	                         " elementary"," middle"," impossible"," high school",
//	                         " scholar"};
//	    System.out.println("Enter age:");
	    if ( ((age < 2 || age > 18) )&& age >0) {
	    System.out.println("ineligible");
	    }else if (age == 2 ) {
	    System.out.println(" toddler");
	    } else if (age == 3 || age == 4 || age == 5){
	    System.out.println("early childhood");
	    }else if (age == 6 || age == 7){
	    System.out.println("young reader");
	    }else if (age == 8 || age == 10){
	    System.out.println("elementary");
	    }else if (age == 11 || age == 12){
	    System.out.println("middle");
	    }else if (age == 13){
	    System.out.println("impossible");
	    }else if (age == 14 || age == 16){
	    System.out.println("high school");
       }else {
	    System.out.println("invalid entery");

	}

	}}
