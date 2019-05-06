package homeWorks;
import java.util.*;
public class FindAPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
	    
	    while (!start.equalsIgnoreCase(end)) {
	    	switch (start) {
	    	case ("A"):
	    		System.out.print("right > ");
	    	start = "B";
	    	break;
	    	case ("B"):
	    		System.out.print("down > ");
	    	start = "C";
	    	break;
	    	case ("C"):
	    		System.out.print("left > ");
	    	start = "D";
	    	break;
	    	case ("D"):
	    		System.out.print("up > ");
	    	start = "A";
	    	break;	
	    	
	    		
	    	}
	    }
	    System.out.print(end + " found");

	}

}
