package oca_Quizes;
import java.lang.Object;
public class Zebra extends Animal {
	public Zebra(int age){
		super(age);
	}
	public Zebra(){
		this(4);
	}
	
	public static void main(String[] args) {
		Zebra zeb = new Zebra();
	}
	
}
