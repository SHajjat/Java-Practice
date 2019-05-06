package day24;

public class Cities {
	public static void main(String[] args) {
		String [] cities = { "Amman" , "Irbid", "Aqaba", "baqa", "zarka", "azrak", "kofor Som", "mafraq"};
		
		System.out.println(cities.length);
		for (int i = 0 ; i<cities.length; i++) {
			if ( cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		
		
		
	//  for (VariableTypeWeAreGetting TempVariableNameToUSe : ArrayName )
		for ( String city : cities) {
			if (city.toLowerCase().startsWith("a")) {
				System.out.print(city +"\t");
			}
			
		}
		
	}

}
