package day06_operators2;
import java.util.Scanner;

public class ScannerImport {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);//Scanner is a class. and A class is a blueprint or templet.
		//or you can look at it as a code that can create useful stuff.
		//scan is a variable that is holding an object of scanner class
        System.out.println("put a damn number man");
		String number = scan.next();
      System.out.println("you entered : "+ number);*/
		int areaCode , localNumber;
		  String phoneNumber;
		  Scanner input = new Scanner (System.in);
		  areaCode = input.nextInt();
		  localNumber = input.nextInt();
		  phoneNumber = "("+ areaCode+")-" +localNumber;
		  System.out.println(phoneNumber);
      
	}

}
