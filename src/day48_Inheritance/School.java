package day48_Inheritance;

public class School {
	public static void main(String[] args) {
		Person person = new Person();
		Student student = new Student();
		person.name="Obama";
		person.age = 57;
		person.gender = 'M';
		
		student.name="Roman";// its working for both of them
		student.age = 30;
		student.gender = 'M';
		
		person.eat("steak");
		student.eat(("Mansaf"));
		
		person.walk(8);
		student.walk(7);
		
		Student student2 = new Student();
		student2.name = "Orhan";
		student2.age = 40;
		student2.gender='M';
		student2.studentID = 1234;
		student2.clazz = "JAVA";
		student2.attendClass();
		student2.code("JAVA");
		student2.eat("Khara");
		student2.walk(3);
		student.code("Python3");
		Employee employee1 = new Employee();
		employee1.name = "keke";
		employee1.jobTitle= "no one knows";
		employee1.gender = 'u';
		employee1.age = 233;
		
		Employee employee2 = new Employee();
		employee2.name = "Muradil";
		employee2.age = 30;
		employee2.gender = 'm';
		employee2.jobTitle = "whatEva";
		
		employee1.work();
		employee1.eat("rice");
		employee2.sleep(3);
		
		
		
		
	}
}
