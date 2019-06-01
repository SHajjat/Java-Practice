package day50_inheritance03;

public class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("Cat is saying mewo mwew");
	}
	public void move (int step){
		System.out.println("Cat is moving "+ step);
	}
}
