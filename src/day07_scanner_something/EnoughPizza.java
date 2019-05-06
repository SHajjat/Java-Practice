package day07_scanner_something;

public class EnoughPizza {

	public static void main(String[] args) {
		//slices in pizza ->8
		//slices per students -> 2
		int pizzaCount = 30;
		int studentCount = 145;
		boolean isEnoughPizza = ((pizzaCount*8)>=studentCount*2);
		System.out.println(isEnoughPizza);
		System.out.println((pizzaCount*8)-studentCount*2);
	}

}
