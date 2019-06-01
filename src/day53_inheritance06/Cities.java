package day53_inheritance06;

public class Cities {
	public static void main(String[] args) {
		City amman = new City(1,"Amman");
		City tyson = new City(1,"Tysons");
		City amman2 = new City(1,"Amman");
		System.out.println(amman.toString());
		System.out.println(amman.equals(tyson));
		System.out.println(amman.equals(amman2));
		System.out.println( "This is false " + (amman == amman2));
		amman=amman2;
		System.out.println("This is true since i change the memeory location to point to the same direction " + (amman == amman2));
		System.out.println("Thank you for watching , come back again");
		System.out.println(amman.hashCode());//same hashcode since same location with amman2
		System.out.println(amman2.hashCode());
		System.out.println(tyson.hashCode());// habibi wallah
		City city = new City(12123 , "Frederick");
		Capital capital = new Capital(1, "Amman" , 1);
		
		//this is called variable hiding,
		System.out.println(city.count);//will take 100 from class city
		System.out.println(capital.count); // will take 1 from class capital
		
		System.out.println(city.toString());
		System.out.println(capital.toString());// count will go to the closest to it, so it will take the count from capital
		
		
		
		
		
		}
	}

