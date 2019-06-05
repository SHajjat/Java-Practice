package day42_encapsulation;

public class Coffee {
	String name , size;
	double price;
	int calories;
	
	public void getCoffeeInfo() {
		String info = name.toUpperCase() + "  "+ size.toUpperCase() + " $"+price+ "  "+calories+" CAL";
		System.out.println(info);
	}
	
	public void setName (String newName) {
		name=newName;
	}
	
	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("TALL") || newSize.equalsIgnoreCase("grande")|| newSize.equalsIgnoreCase("venti")) {
		size = newSize;
	}else {
		size= "unKnown";
		System.out.println("Invalid Size "+ newSize);
	}
			
	}
	public void setPrice (double newPrice) {
		price = newPrice;
	}
	public void setCalories( int newcal) {
		calories = newcal;
	}
	
	public void setCoffeeInfo ( String newName , String newSize , double newPrice , int newcal) {
		setName(newName);
		setSize(newSize);
		setPrice(newPrice);
		setCalories(newcal);
		
		
		
	}

}
