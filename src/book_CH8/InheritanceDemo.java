package book_CH8;

public class InheritanceDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Ahmad Mohammad");
		s.setStudentNumber(1234);
		s.writeOutput();
		Student s2 = new Student("Ahmad mohammad", 1234);
		System.out.println(s.equals(s2));
		System.out.println(s.getName("Sir"));
		s.writeOutput();
		s.writeOutput("a");
		Undergradute g = new Undergradute();
		g.setLevel(-1);
	}
}
