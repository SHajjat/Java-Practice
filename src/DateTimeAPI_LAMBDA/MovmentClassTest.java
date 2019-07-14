package DateTimeAPI_LAMBDA;

import day56_abstraction02.MobilePhone;
/*
Functional interface is an interface that have a single abstract method ******
it can optionally have @FunctionalInterface annotation


 */
public class MovmentClassTest {
	public static void main(String[] args) {
		Movable animal = new Animal();
		Movable truck = new Truck();
		Movable moterCycle = new MoterCycle();
		animal.move(1);
		truck.move(2);
		moterCycle.move(3);
		
		Movable animal2 = new Movable() {// this is the way you can instantiate (this is called annuminus inner class
			@Override
			public void move(int i) {
				System.out.println("Animal is moving slow "+ i +" MPH");
			}
		};
		
		Movable truck2 = new Movable(){
			@Override
			public void move(int i) {
				System.out.println("truck is moving slow "+ i +" MPH");
			}
			
		};
		
		Movable moterCycle2 = new Movable() {
			@Override
			public void move(int i) {
				System.out.println("MoterCycle is moving slow "+ i +" MPH");
			}
		};
		// LAMBDAAAAAAAAAA
		//1)if you have one parameter , you can remove parameter type,
		// 2)if you remove the parameter you can remove the ()
		//3)if you have one line in the method , the {} are optional as follow
		//1)
		Movable step1 = (i) ->{
			System.out.println("MoterCycle is moving slow "+ i +" MPH");
		};
		//2)
		Movable step2 = i -> {
			System.out.println("MoterCycle is moving slow "+ i +" MPH");
		};
		
		//3)
		Movable howAwsome = i -> System.out.println("MoterCycle is moving slow "+ i +" MPH");
		//loook atttt thiissssssssss******
		
		
		Movable lambdaMoterCycle = (int i ) ->{
			System.out.println("MoterCycle is moving slow "+ i +" MPH");
		};
		
		Movable lambdatruck = (int i )->{
			System.out.println("Truck is moving slow "+ i +" MPH");
		};
		
		Movable lambdaAnimal = (int i ) ->{
			System.out.println("animal is moving slow "+ i +" MPH");
		};
		
		howAwsome.move(1);//thats how you call it
	}
}
