package day46_static_keyword;

public class vehicle {
	String style ;
	static int numbeOfVehicles;
	
	public static void vehicleInfo(){
		//System.out.println("type: "+ type); you cant call non static with static method
		System.out.println("numbeOfVehicles "+numbeOfVehicles);
		
		int count = getNumbeOfVehicles();
		
		String make = "kia";
		make = make.toLowerCase();
		System.out.println("make :"+ make);
		
		
	}
	
	public static int getNumbeOfVehicles(){// if you remove the static from here like 11 will not compile
		return numbeOfVehicles;
	}
	public String toString(){
		return "Vehicle Style : " + style + "| number of vehicles : "+numbeOfVehicles;
	}
}
