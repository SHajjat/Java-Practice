package day41_Custom_Classes;

public class Car_Moving {
	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.color = "red";
		car1.currentSpeed =100;
		car1.make = "Ford";
		car1.model="F150";
		car1.printCarInfo();
		car1.showCurrentSpeed(50);
		car1.drive();
		car1.accellerate(-40);
		System.out.println("after changing the speed , your new speed is "+ (car1.currentSpeed));
		BMW car2 = new BMW();
		System.out.println(car2.make);//make was assigned in the class
		car2.model = "740i";
		car2.showPrice();//checks for the model the give the price in the switch statment
		
		System.out.println("Car Price "+car2.price);//the price is assgined in the switch statment
		
		BMW bmw2 = new BMW();
		bmw2.model = "X6";
		bmw2.showPrice();
		
		
	}

}
