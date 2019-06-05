package day42_encapsulation;
import java.util.*;

public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno MAgli,9.5";
		String []arr = data.split(",");
		
		Shoes [] myShoes = new Shoes[1];
		 Shoes shoe1 = new Shoes ();
		 shoe1.setShoesData(arr[0],Double.parseDouble(arr[1])) ;
		 System.out.println(shoe1.getShoesData());
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println("What shoe brand ?");
		 String brand = scan.next();
		 System.out.println("What is your size?");
		 double size = scan.nextDouble();
		 
		 Shoes sShoes = new Shoes();
		 sShoes.setShoesData(brand, size);
		 System.out.println(sShoes.getShoesData());
		 
		
		
	}

}
