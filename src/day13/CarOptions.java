package day13;
import java.util.*;
public class CarOptions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("What type of car are you interested in?");

		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean");

		int carType = scan.nextInt();
		double averagePrice = 0;
		String carOptions ="";

		switch (carType) {
		case 1:
			averagePrice = 33000;
			carOptions = "American: Ford";
			break;
		case 2:
			averagePrice = 32000;
			carOptions = "Japanese: Subaru";
			break;
		case 3:
			averagePrice = 55000;
			carOptions = "German: BMW";
			break;
		case 4:
			averagePrice = 85000;
			carOptions = "Italian: Lambo";
			break;
		case 5:
			averagePrice = 25000;
			carOptions = "Korean: Kia";
			break;
		default:
			averagePrice = 0;
			carOptions="not availabe";
			System.out.println("Car type not available");
			break;
			
		}
		String str = "&";
		int numberOfPeople = 5;
		String convertation = str.repeat(numberOfPeople);

		System.out.println("You selected " + carType + " and your options are " + carOptions);
		System.out.println("Average price: " + averagePrice);

//	public static void main(String[] args) {
//		Scanner scan = new Scanner (System.in);
//		double averagePrice=0 ;
//		int carType;
//		String carOptions;
//		System.out.println("what type of car would you like");
//		System.out.println("your Options are:\n1)American\n2)Japanesn\n3)German\n4)Italian\n5)Korean");
//        carType = scan.nextInt();
//        switch(carType) {
//        case 1 :
//        	averagePrice = 33000;
//			carOptions = "American car and your options are Ford, Dodge, Tesla, Chevrolet, Lincoln";
//        	break;
//        case 2 :
//        	averagePrice = 32000;
//			carOptions = "Japanes car and your options are Toyota, Mitsubisi, Honda, Subaru, Mazda";
//			break;
//        case 3 :
//        	averagePrice = 55000;
//			carOptions = "German car and your options are Bmw, VW, Audi, Mercedes, Porsche";
//			break;
//        case 4:
//        	averagePrice = 85000;
//			carOptions = "Italian car and your options are Alfa Romeo, Ferrari, Lamborghini, Fiat";
//		
//			break;
//        case 5:
//        	averagePrice = 25000;
//			carOptions = "Korean car and your options are Kia, Hyundai, Daewoo";
//			break;
//			default:
//				carOptions = "Car type not available"; 
//				//System.out.println(1.25*200);		
//        }
//        System.out.println(carOptions);
//        System.out.println("Average Price: "+averagePrice);
	}

}
