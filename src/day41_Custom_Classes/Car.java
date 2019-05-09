package day41_Custom_Classes;

import java.awt.geom.CubicCurve2D;

public class Car {
	String make,model,color;
	int currentSpeed;
	
	public void printCarInfo() {
		System.out.println("Car make ["+make+"], model ["+model+"], color ["+color+"] currentSpeed ["+currentSpeed+"]");
	}
	
	public void showCurrentSpeed(int SpeedLimit) {
		String speedLimitStr = currentSpeed >SpeedLimit?"over Speed Limit":"following speed limit";
		System.out.println(make+ " is driving at "+currentSpeed+" mph ,"+speedLimitStr+"-"+SpeedLimit);
	}
	
	public void drive() {
		System.out.println(make + " "+model + " is driving");
	}
	public void accellerate(int howMuch ) {
		
		currentSpeed+=howMuch;
		
//		System.out.println("after changing the speed , your new speed is "+ (currentSpeed));
		
	}
	
	
	}


