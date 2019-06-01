package book_CH8;

public class PolymorphismDemo {
	public static void main(String[] args) {
		//set up array of type people to include 4 people who are might be  student , undergrads or employees
		Person[] people = new Person[4];
		//add objects to the array that represent members of the committee .
		// in the example below we have added three objects of the type Undergraduate and one object of the type Student
		
		people[0] = new Undergradute("Cotty, Manny", 4910,1);
		people[1] = new Undergradute("Kick, Anita", 9931,2);
		people[2] = new Student("DeBanque, Robin",8812);
		people[3]= new Undergradute("Bugg, June", 9901,4);
		
		for (Person p : people){
			p.writeOutput();
			System.out.println();
		}
		
		double d = 100.2;
		System.out.println("Hello world "+((int)d));
		
	}
}
