package day65_Collections;

import java.util.*;

public class CollectionsSort {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(34);
		nums.add(3);
		nums.add(5);
		nums.add(3232);
		Collections.sort(nums);
		Student st1 = new Student(100 , "someone");
		Student st2 = new Student(130 , "someone2");
		Student st3 = new Student(1040 , "someone3");
		Student st4 = new Student(1550 , "someone4");
		Student st5 = new Student(1550 , "someone5");
		List<Student> student = new ArrayList<>();
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st1);
		
		// collections doesnt know how this list so we use comparable interface .
		//implement interface class
	}
	

}
class Student implements Comparable{
	private int id;
	private String name;
	public Student(int id , String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name=" + name  +
				'}';
	}
	
	@Override
	public int compareTo(Object AnotherStudent) {
		// compare to method returns an int excepts an object of certain type , it helps compare objects and
		//decide which is larger or smaller or equal
		//returns positive value - if first object is greater than second
		//returns a negative value - if first object is less than second
		//returns zero - if first object equals to second
		AnotherStudent = (Student)AnotherStudent;
		if (this.id > ((Student) AnotherStudent).id){//first is greater
			return 1;
		}else if (this.id < ((Student) AnotherStudent).id) {//second is smaller
			return -1;
		}else{
		return 0;
	}
		}
		
}


class SortStudents {
	public static void main(String[] args) {
		
		
		List<Student> stList = new ArrayList<>();
		stList.add(new Student(300,"someone1"));
		stList.add(new Student(302,"someone2"));
		stList.add(new Student(301,"someone3"));
		stList.add(new Student(333,"someone4"));
		stList.add(new Student(305,"someone5"));
		
		System.out.println(stList.toString());
		
		Collections.sort(stList); //it will not compile since it doesnt know how to sort Students objects
		/* unless we override compareTo
		1)implement comparable interface.
		2)Override compare to method
		3)do that in student class
		 */
		System.out.println(stList);
		
		Student student1 = new Student(1,"fi");
		Student student2 = new Student(3,"faker");
		System.out.println(student1.compareTo(student2));
		
		//when using collections.sort to sort a list of custom object, we need to first implement Comparable
		//interface and override compareTo method
		//when overriding compareTo method, we can use conditional statments
		//by comparing instance variable to find out which one is greater or less or equals .
	}
}
