package day46_static_keyword;

public class Resturant {
	public static void main(String[] args) {
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		System.out.println("Total slices "+Dinner.pizzaSlices);// you can access through the class name directly
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		System.out.println("total slices : " + Dinner.pizzaSlices );
		System.out.println("total Slices from dad view :"+ dad.pizzaSlices);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		//mom.takeASlice();
		System.out.println("Total Slices : "+ mom.pizzaSlices);
		
		
		
	}
}
