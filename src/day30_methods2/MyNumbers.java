package day30_methods2;
import java.util.*;
public class MyNumbers {
	
	
	/*This method will do the following
	 * will generate random number
	 * it will print random number
	 * it will repeat 5 times
	 */
	public static void showMe5Numbers() {
		Random rand = new  Random ();
		for (int i = 0 ; i<5 ; i++) {
		System.out.print(rand.nextInt(1001)+" ");
		}
		System.out.println();//will take me to the next line
		
	}
	/*name :pushUp
	 * reruen type : void
	 * params : no
	 */
	
	
	 public static void doPushUp (){
		 for (int i = 1 ; i<=10 ; i++) {
			 System.out.println("pushUp - "+i);
			 
		 }
		 System.out.println("Time to rest"); 
	 }
	 
	 public static void rangePrint() {
		 System.out.println("Enter two numbers");
		 int num1 = new Scanner(System.in).nextInt();
		 int num2 = new Scanner(System.in).nextInt();
		 while (num1 !=num2 ) {
			int n = num1>num2 ? -1 :1;
			System.out.print(num1+", ");
			num1+=n;
			 }
		 System.out.print(num1 );
		 System.out.println();
		 
		 
	 }
	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		doPushUp();
		rangePrint();
	}

}
