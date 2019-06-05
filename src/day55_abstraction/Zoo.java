package day55_abstraction;

public class Zoo {
	public static void main(String[] args) {
		Cat sh_hebar = new Cat();
		sh_hebar.speak();
		
		Dog sasha = new Dog();
		sasha.setName("POOCHI");
		sasha.speak();
		
		sh_hebar.eat();
		sasha.eat();
		System.out.println(sh_hebar.getName());
		
		
		
	}
}
