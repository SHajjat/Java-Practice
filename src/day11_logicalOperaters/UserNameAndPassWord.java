package day11_logicalOperaters;
import java.util.*;
public class UserNameAndPassWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String userName = "cybertek@mail.com";
		String passWord = "WoodenSpoon123";
		// if you want to say it does not equal use (! .equals )and (! .equalsIgnoreCase
		System.out.println("Enter Your user name and passward");
		String enteredUser = scan.next();
		System.out.println("Enter password");
		String enteredPass = scan.next();
		if (userName.equalsIgnoreCase(enteredUser) && (passWord.contentEquals(enteredPass))){
			System.out.println("Login Successful, Welcome!");
		}else if ((!userName.equalsIgnoreCase(enteredUser))&& (!passWord.contentEquals(enteredPass))){
			System.out.println("your userName and PassWork are incorrect");
	    }else if (!userName.equalsIgnoreCase(enteredUser)) {
			System.out.println("Your UserName is invalid");
		}else if (!passWord.contentEquals(enteredPass)) {
			System.out.println("Your Password is invalid");
		}
	}

}
