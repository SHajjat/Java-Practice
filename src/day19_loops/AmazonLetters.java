package day19_loops;
import java.util.*;
public class AmazonLetters {

	public static void main(String[] args) throws InterruptedException {
		//onAmaz and nozAma
		
		String amazon , onAmaz= "";
		System.out.println("what is the word bro ");
		amazon = new  Scanner (System.in).next();
		int i=amazon.length()-1 , j=0;
		char first , second;
		while (i >=0 && i < amazon.length()) {
		    onAmaz+=amazon.charAt(i);
		    if (i >=amazon.length()-1) {	
			i--;
		    }else if (i==amazon.length()-3) {
		    	break;
		    }else {
		    	i=j;//fliping the counter
		    	j++;
		    	
		    }
		}
		System.out.println(onAmaz);

	}

}
