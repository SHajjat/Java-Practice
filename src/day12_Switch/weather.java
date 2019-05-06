package day12_Switch;
import java.util.*;

import javax.sound.midi.Soundbank;
public class weather {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("how is the weather??");
	    String weather = scan.next().toLowerCase(); //change all inputs to lower case
	   
	    switch (weather) {
	    case"sunny":
	    	System.out.println("go to the park\ncode java");
	        break;
	    case"hot":
	    	System.out.println("go swimming\n code java");
	        System.out.println("take bakini pictures and post on slack");
	        break;   
	    case"windy":
	    	System.out.println("fly a kite\ncode java");
	        break;
	    case("rainy"):
	    	System.out.println("go to the park\ncode java");
	        break;
	    case("snow"):
	    	System.out.println("cahin your tyres");
	    	System.out.println("go to the park\ncode java");
	        break;
	        default:
	        	System.out.println("code java in any other condition");
	    }

	}

}
