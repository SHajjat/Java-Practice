package book_CH5;

public class DogDemo {

	public static void main(String[] args) {
		Dog sasha = new Dog();
		sasha.name = "Sasha";
		sasha.age = 5;
		sasha.breed = "Husky";
		sasha.writeOutPut();
		sasha.getAgeInHumanYears();
		
		Dog scooby = new Dog() ;
		scooby.name = "Scooby";
		scooby.breed="Great Dane";
		scooby.age=42;
        scooby.writeOutPut();
        scooby.getAgeInHumanYears();
	}

}
