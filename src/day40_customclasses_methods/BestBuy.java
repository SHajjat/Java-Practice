package day40_customclasses_methods;

public class BestBuy {

	public static void main(String[] args) {
		//System.out.println(brand);
		//above line will not work , we need object to use brand
		//create Cellphone object
		String test = null ;
		
		CellPhone cell1 = new CellPhone();
		cell1.brand= "Iphone";
		cell1.Color="Gold";
		cell1.screenSize=6.5;
		cell1.price=1120.22;
		System.out.println("Cell Phone Price : "+cell1.price);
		System.out.println("Cell Phone Color : "+cell1.Color);
		System.out.println("Cell Phone brand : "+cell1.brand);
		System.out.println("Cell Phone Screen Size : "+cell1.screenSize);
		System.out.println(cell1.toString());
		// we cant directly access the method we need to name it first
		
		CellPhone cell2 = new CellPhone();
		cell2.brand= "Siemens";
		cell2.Color="blue";
		cell2.screenSize=1.5;
		cell2.price=39.22;
	
		System.out.println("### CALLING METHIDS ###");
		
		cell2.call();
		cell1.message();
		cell2.takeAPhoto();
}
}