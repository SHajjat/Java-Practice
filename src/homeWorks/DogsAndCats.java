package homeWorks;
import java.util.*;
public class DogsAndCats {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int countOfCats = 0;
	    int countOfDogs = 0;
	    String word = scan.next();
	    countOfCats = word.replace("cat","").length();
	    countOfDogs = word.replace("dog","").length();
	    System.out.println(countOfCats==countOfDogs);
	    			
	    }

	

}
