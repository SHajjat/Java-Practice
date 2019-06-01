package book_CH8;
import java.util.Scanner;

public class SomeClassTest {
	public static void main(String[] args) {
		Student studentObject = new Student("Jane Doe" ,123);
		Undergradute undergraduteObject= new Undergradute("Jack Buck" , 1234 ,1);
		SomeClass.compareNumbers(studentObject , undergraduteObject);// since UnderG is object of Student this could work
		//every object of the type Undergrad is also a type of Student
		//SomeClass.compareNumbers((Student) new Person("RyAN"), studentObject);
		//Exception in thread "main" java.lang.ClassCastException: class book_CH8.Person cannot be cast to class
		// book_CH8.Student (book_CH8.Person and book_CH8.Student are in unnamed module of loader 'app')
		//	at book_CH8.SomeClassTest.main(SomeClassTest.java:9)
		Person joePerson = new Person("Josephine Student");
		System.out.println("Enter your name ");
		String newName = new Scanner (System.in).nextLine();
		Undergradute someUndergrad = new Undergradute(newName , 222, 3);
		if (joePerson.hasSameName(someUndergrad))
			System.out.println("Wow , same names!");
		else
			System.out.println("different names");
		 
		Student s = new Student();
		Undergradute ug = new Undergradute();
		//Student p0 = (Student) new Person(); this dont fucking work
		Person p1 = s;
		Person p2 = ug;
		Student s2 = (Student) p1;
		Person p0 = new Person();
		//Student s0 = (Student)p0;
		
		
		System.out.println(s2.getStudentNumber());
			
		
		TitledPerson person1 = new TitledPerson("Samir" , "Mr");
		TitledPerson person2 = new TitledPerson("Samir","Mr");
		System.out.println("Test 123 ");
		person1.equals(person2);
		
	}
}
