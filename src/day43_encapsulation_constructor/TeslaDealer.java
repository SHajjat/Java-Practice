package day43_encapsulation_constructor;

public class TeslaDealer {
	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(52450);
		tesla.setSelfDriving(true);
		
		System.out.println(tesla.getModel());
		System.out.println(tesla.getRange());
		System.out.println(tesla.getColor());
		System.out.println(tesla.getZeroTo60());
		System.out.println(tesla.isSelfDriving());
		System.out.println(tesla.getPrice());
		System.out.println(tesla);
		System.out.println(tesla.toString());
	}

}
