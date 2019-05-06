package day23;
import java.util.*;
public class BruteForce {

	public static void main(String[] args) {
		int i = 0;
		String userName = "Samir";
		String passWord = "ABC123";
		do {
		 if ( i == 0) {
			 System.out.println("Welcome user man");
		 }else if (i==5) {
			 System.out.println("bye bye bitch");
			 return;
		 }
		 System.out.println("please enter username");
		 String user = new Scanner (System.in).next();
		 if (!userName.equals(user)) {
			 i++;
			 System.out.println("you user name is incorrect you have "+(5-i)+" attempts");
			 continue;
		 }
		 System.out.println("please enter password");
		 String pass = new Scanner (System.in).next();
		 if (!passWord.equals(pass)) {
			 i++;
			 System.out.println("you password is incorrect you have "+(5-i)+" attempts");
			 continue;
		 }
		 System.out.println("Welcome back "+ userName);
		 break;
			
		}while(i<=5);
		System.out.println("you blocked man, bloooooooocked");

	}

}
