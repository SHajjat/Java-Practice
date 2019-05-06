package homeWorks;
import java.util.*;
public class FindBread {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		     String str = scan.next();
		     for (int i = 0 ; i<str.length()-4;i++){
		    	 if(str.charAt(i)==('b')) {
		    		 if(str.substring(i,i+5).equals("bread")){
		    			 for(int j = str.length()-1; j>i+5;j--) {
		    				 
		    				 if(str.substring(j-4).contains("bread")) {
		    					 System.out.println(str.substring(i+5,j-4));
		    					 System.exit(0);
		    				 }
		    			 }
		    			 
		    		 }
		    		 
		    		 
		    	 }
		    	 
		     
		        
		     }
		     System.out.println("nothing");

	}

}
