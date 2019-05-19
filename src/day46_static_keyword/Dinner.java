package day46_static_keyword;

public class Dinner {
	public static int pizzaSlices = 8; // if you remove static every intant method will have his own variable
	//you can access static variable through class name or object
	
	public void takeASlice(){
		pizzaSlices--;
	}
	public void takeASlice(int count){
		pizzaSlices-=count;
	}
}
