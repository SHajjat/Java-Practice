package day48_Inheritance;

public class WarmUp {
	private int y;
	public static void main(String[] args) {
		int n;
		System.out.println(n = 83);
	}
	private String a = "what";
	static { add(2); }
	
	public void setY(int y) {
		this.y = y;
	}
	
	static void add(int num) { System.out.print(num + " "); }
	
	WarmUp() {
		//WarmUp down = new WarmUp(); it will go in to infinite loop
		
		add(5); }
	
	static { add(4); }
	
	static { add(6); }
	public void whatsup(){
		System.out.println("Whats up");
	}
	public static void whatsDown(){
		System.out.println("whats down");
		WarmUp down = new WarmUp();
		
	}
	{whatsDown();}
	
	static  { WarmUp up =new WarmUp(); up.whatsup();}
	
	{ add(8); }
	
	
	
	
}
