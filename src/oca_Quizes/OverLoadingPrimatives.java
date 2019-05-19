package oca_Quizes;

public class OverLoadingPrimatives {
	public void overLoad(int x){
		System.out.println("integer");
	}
	public void overLoad ( long x){
		System.out.println("Long");
	}
	
	public static void overLoad(float x){
		System.out.println("float nigga");
	}
	
	public static void main(String[] args) {
		OverLoadingPrimatives flyer = new OverLoadingPrimatives();
		flyer.overLoad(345);
		flyer.overLoad(345L);
		flyer.overLoad(34242352323f);
	}
}
