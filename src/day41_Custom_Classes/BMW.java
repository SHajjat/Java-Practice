package day41_Custom_Classes;

public class BMW {
	 final String make = "BMW";
	String model;
	double price;

	public void showPrice() {
/*
           330i - 40,250
           740i - 86,450
            m3 - 66,500
 */
		switch (model) {
		case "330i":
            price = 40250;
			break;
		case "740i":
			price =86450;
			break;
		case "M3":
			price =66500;
			
			break;
		 default:
			 price=0.0;
			 System.out.println("unknown model ," +model +" not avaliable");

			break;
		}
		System.out.println("Price is " + price);
		

	}

}
