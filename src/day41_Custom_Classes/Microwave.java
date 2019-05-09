package day41_Custom_Classes;

public class Microwave {
	String brand ;
	boolean isOn;
	
	
	public void turnOn() {
		System.out.println("turning on the"+brand+" microwave");
	    String AlreadyOn = isOn ?"it is already On":"";
	    System.out.println(AlreadyOn);
		isOn = isOn ?isOn:!isOn;
	}
	
public void turnOff() {
	System.out.println("turning off the "+brand+" microwave");
    String AlreadyOff = isOn ?"":"it is already Off";
    System.out.println(AlreadyOff);
	isOn = isOn ?!isOn:isOn;	
		}
public void heat(String food) {
	if(isOn) {
		System.out.println("heat the " +food);
	}else {
		System.out.println("turn on first ");
	}
}

}
