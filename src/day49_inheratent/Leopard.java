package day49_inheratent;

public class Leopard extends Animal {
	private String type;
	
	public Leopard(){
		super();// parameters must match with parent class constructor
		//it needs to be first statment in the child class constructor
		//this() needs to be the first statment in the constructor so you cant have both
		System.out.println("Leopard Constructor");
		setType("Leopard");
	}
	
	public Leopard(String type){
		super(type);
		System.out.println("after the super");
		this.type =getType();
	}
}
