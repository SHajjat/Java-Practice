package day52_Inheriitance05;

import java.util.Objects;

public class Computer {
	private String model ;
	private String color;
	
	public Computer() {
	}
	
	public Computer(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public boolean equals(Object other ) {
		 Computer that = ( Computer) other;
		if(this.model.equals(that.model) && this.color.equals(that.color)){
			return true;
		}
		
		return false;
		
	}
	
	
	
}
