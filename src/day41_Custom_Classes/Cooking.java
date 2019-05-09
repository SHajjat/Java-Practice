package day41_Custom_Classes;

public class Cooking {
public static void main(String[] args) {
	Microwave iftar = new Microwave();
	iftar.brand = "Samsung";
	iftar.isOn = true;
	iftar.heat("taco");
	iftar.turnOn();
	iftar.turnOff();
	iftar.turnOff();
}
}
