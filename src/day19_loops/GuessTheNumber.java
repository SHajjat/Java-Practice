package day19_loops;
import java.lang.reflect.Array;
import java.util.*;
public class GuessTheNumber {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("Enter the number");
		String answer = "0" ;
		answer.contains("s");
		//int guessednumber = (int)( Math.random()*1000);
		//System.out.println(guessednumber);
        int guessednumber = random.nextInt(10);
		
 		int number ;
  		do {
		
    		number = new Scanner (System.in).nextInt();
			answer = number==guessednumber ? "you got it man": number > guessednumber ? "your number is too big\ntry another number fool": "your number is too small\ntry another number fool";
			System.out.println(answer);
			//System.out.println(guessednumber);
			
		}while (number!=guessednumber);
  		
  		//int []a = new Array [4];
		

	}

}
