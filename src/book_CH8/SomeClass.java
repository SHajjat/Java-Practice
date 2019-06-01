package book_CH8;

public class SomeClass {
	public static void compareNumbers (Student s1 , Student s2){
		if (s1.getStudentNumber() == s2.getStudentNumber())
			System.out.println(s1.getName()+" has the same number as "+ s2.getName());
		else
			System.out.println(s1.getName()+" has a different number than "+ s2.getName());
	}
}
