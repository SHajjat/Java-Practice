package day14StringManipalation;
import java.util.*;
public class HWCOMPUTER {

	public static void main(String[] args) {
		   double price = 0;
			String storageType, screenType, cpu;
			int ram = 0 ;
			Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE
	    System.out.println("Select screen size:");
	    String screenSize = scan.next();
	    if (screenSize.equals("13.3")) {
	    price += 200;
	}else if (screenSize.equals("15.5")) {
	    price += 300;
	    }else if (screenSize.equals("17.3")) {
	    price +=400;
	    } else {
	    System.out.println("not valid screenSize");
	}
	    System.out.println("Select CPU type:");
	    cpu = scan.next();
	    
	    if (cpu.equalsIgnoreCase("i3"))
	    price += 150;
	    else if (cpu.equalsIgnoreCase("i5"))
	    price += 250;
	    else if (cpu.equalsIgnoreCase("i7"))
	    price +=350;
	    else
	    System.out.println("not valid CPU");
	    
	    System.out.println("Select RAM size:");
	    ram= scan.nextInt();
	    price += (ram/4)*50;
	    
	    System.out.println("Select storage type:");
	    storageType = scan.next();
	    System.out.println("Enter memory size:");
	    int memorysize = scan.nextInt();
	    
	    if (storageType.equalsIgnoreCase("HDD")){
	      price +=(memorysize/500)*50;
	    }else if (storageType.equalsIgnoreCase("SSD")){
	      price +=(memorysize/500)*100;
	    }
	    System.out.println("Enter screen resolution:");
	    screenType = scan.next();
	    if (screenType.equalsIgnoreCase("FULLHD")){
	      price+=100;
	    }else if (screenType.equalsIgnoreCase("4K")) {
	      price +=200;
	    }
	    System.out.printf("Laptop price is: $%4.2f",price);
}
} 

	

