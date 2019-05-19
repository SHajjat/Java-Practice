package day45_encapsulation_practice;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	
	
	public static void main(String[] args) {
		List <String > javaTeachers = new ArrayList<>();
		javaTeachers.add("Vasyl");
		javaTeachers.add("Murodil");
		javaTeachers.add("Marufjon");
		javaTeachers.add("Muhtar");
		Course course1 = new Course();
		course1.setTeachers(javaTeachers);
		System.out.println(javaTeachers.toString());
		List <String> javaStudents = new ArrayList<>();
		javaStudents.add("Samir");
		javaStudents.add("Murad");
		javaStudents.add("Abdullah");
		javaStudents.add("Whoever");
		
		course1.setStudentName(javaStudents);
		
		course1.addTeacher("Maria");
		course1.addStudent("Ryan");
		
		if (course1.getTeachers().contains("Maria")){
			System.out.println("Maria is a teacher");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if (course1.getStudents().contains("Ryan")){
			System.out.println("Ryan is a Student");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		course1.removeTeacher("Murodil");
		course1.removeStudent("Roman");
		
		if (!course1.getTeachers().contains("Murodil")){
			System.out.println("Murodil is removed Successfully");
		}else{
			System.out.println("failed");
		}
		if (!course1.getStudents().contains("Roman")){
			System.out.println("Roman is removed Successfully");
		}else{
			System.out.println("failed");
		}
	}
}
