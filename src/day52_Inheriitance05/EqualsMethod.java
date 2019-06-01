package day52_Inheriitance05;

public class EqualsMethod {
	public static void main(String[] args) {
		Computer comp1 = new Computer("IMac", "Silver");
		
		Computer comp2 = new Computer("IMac", "Silver");
		Computer comp3 = comp2; // comp3 and comp2 are pointing to the same object
		
		System.out.println(comp1 == comp2); //false
		System.out.println(comp1.equals(comp2));// false since they point to different objects
		System.out.println(comp3 == comp2); // comp3 and comp2 are pointing to the same object so true
		System.out.println(comp3.equals(comp2));
		System.out.println(comp1.getModel() == comp1.getModel());
		String a = "S";
		a.equals(a);
	}
}
