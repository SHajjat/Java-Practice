package oca_Quizes;

public class Static {
	private static String name = "Static Class";
	public static void first(){}
	public static void second(){}
	public void third(){System.out.println(name);}
	
	public static void main(String[] args) {
		first();
		second();
		Static three = new Static ();
		three.third();
		//page 183
		
		
	}
}
