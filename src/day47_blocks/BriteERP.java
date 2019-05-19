package day47_blocks;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BriteERP {
	static{ //automatically run
		System.out.println("Launch browzer");
		System.out.println("navigate to :"+TestData.url);
	}
	
	public static void enterEmail(){
		System.out.println("Enter email: "+TestData.email);
	}
	public static void enterPassWord(){
		System.out.println("Enter Pass word "+ TestData.password);
	}
	public static void verifyLogin(){
		System.out.println("Expected Name: "+TestData.userName);
		System.out.println("Actual name displayed: I forgot her name ");
		System.out.println("Login successful: "+ LocalDateTime.now());
	}
}
