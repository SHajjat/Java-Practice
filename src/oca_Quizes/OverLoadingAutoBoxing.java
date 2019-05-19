package oca_Quizes;

public class OverLoadingAutoBoxing {
	//public void fly (Integer x){ System.out.println("Integer"); }
	//public void fly (int x){ System.out.println("int"); }
	//public void fly (String s){System.out.println("String");}
	public void fly (Object s){System.out.println("Object");}
	
	public static void main(String[] args) {
		OverLoadingAutoBoxing flyer1 = new OverLoadingAutoBoxing();
		flyer1.fly(1);
		flyer1.fly(new Integer(1));// you have to tell it that its a wrapper
		flyer1.fly("String");
		flyer1.fly("Object");//if we dont have a string method it goes to the object (interesting)
		flyer1.fly(56);
		flyer1.fly(new Integer(56));
		flyer1.fly(new Object());
		//if the only thing we have is an object method all go to the object
	}
}
