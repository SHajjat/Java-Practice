package homeWorks.VendingMachine2;

public class Customer {
	public static void main(String[] args) {
		DrinkVendingMachine d = new DrinkVendingMachine(new Drink("Pepsi",1.5,3) ,
				new Drink("Coke", 2.5, 0));
		d.select(-1);
		System.out.println(d.isSelected);
	}
}
