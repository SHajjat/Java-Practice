package day55_abstraction;

public abstract class Animal {
	private  String name;
	public abstract void speak();// we can not have abstract methods in abstract classes
	public abstract void eat();
	
	public  String  getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {//you can have main in abstract
		System.out.println("ssasa");
	}
}
