package day32_custom_Methods;

public class cooking {
	public static void main(String[] args) {
		makePancakes();
		
	}
	
	private static void makePancakes() {
		System.out.println("~~~~Pancakes Recipe~~~~~");
	add ("Milk , Eggs .flour , sugar , salt");
	mix(120);
	fry(3);
	System.out.println("~~~~Enjoy while hot~~~~~");
	
	
		
	}

	public static void add(String ing) {
		System.out.println("Add "+ing);
		
	}
	private static void mix (int time) {
		System.out.println("mix for "+time + " seconds");
		wait(time);
		
		
	}
	private static void fry(int time) {
		System.out.println("Fry for "+time+ " minuties");
		wait(time);
	}
	private static void boil(int time) {
		System.out.println("Boil for "+time+ " minuties");
		wait(time);
		
	}
	private static void wait (int time) {
		System.out.println("wait for "+ time + " minuties");
	}
	
}
