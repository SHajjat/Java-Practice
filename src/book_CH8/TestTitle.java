package book_CH8;

public class TestTitle {
	public static void main(String[] args) {
		TitledPerson person1 = new TitledPerson("Samir" ,"Mr");
		TitledPerson person2 = new TitledPerson("Samir" , "Mr");
		System.out.println(person1.equals(person2));
	}
}
