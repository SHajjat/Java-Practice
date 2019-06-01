package book_CH8;

public class ChildClass extends ParentClass {
	public ChildClass(){
		System.out.println("Hello from child class");
	}
	
	public ChildClass(String hello){
		super(hello);
		System.out.println(hello + " from one arg constructor in child class ");
	}
	
	
	public static void main(String[] args) {
		ChildClass s = new ChildClass();
		//this outputs :
		//Hello from parent class
		//Hello from child class
		//since super() is added automatically
		ChildClass s2 = new ChildClass("hello");
		//this outputs :
		//hello from one arg in parent class
		//hello from one arg constructor in child class
		//since we explisitly called constructor with one arg in superClass
		
	}
}
