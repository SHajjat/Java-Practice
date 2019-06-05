package day43_encapsulation_constructor;

public class Tesla {
	private String model;
	private String color;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	@Override
	public String toString() {
		return "Tesla [model=" + model + ", color=" + color + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price="
				+ price + ", selfDriving=" + selfDriving + "]";
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getColor () {
		return color;
	}
	
	
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	
	public double getZeroTo60() {
		return zeroTo60;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}


}
