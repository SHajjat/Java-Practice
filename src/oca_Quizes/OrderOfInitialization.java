package oca_Quizes;

public class OrderOfInitialization {
	private String name = "Torchie"; // forth non static variables
	{System.out.println(name);} // fifth non static initaliator
	private static int count =0;// first static variables or initaliator which come first (variable in this case)
	static {System.out.println(count);} //second initaliator
	static {count+=10; System.out.println(count);} // third initaliator
	public OrderOfInitialization (){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		//OrderOfInitialization order = new OrderOfInitialization();
		/*
		0
		10
        Torchie
        constructor
		 */
		//if no instatnt variable is initalized , only superClass and
		//new OrderOfInitialization(); without the new it will output only 0 and 10 , try it i dare you
	}
}
