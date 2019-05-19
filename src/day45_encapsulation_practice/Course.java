package day45_encapsulation_practice;

import java.util.ArrayList;
import  java.util.*;

public class Course {
	private String name;
	private List < String > teachers = new ArrayList<>();
	private  List <String > students = new ArrayList<>();
	
	
	public void addStudent (String STName){
		students.add(STName);
	}
	
	public void addTeacher(String teacherName){
		teachers.add(teacherName);
	}
	
	public void removeTeacher(String teacherName){
		teachers.remove(teacherName);
	}
	public void removeStudent (String studentName){
		teachers.remove(studentName);
	}
	
	
	
	
	
	
	
	public List<String> getTeachers() {
		return teachers;
	}
	
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	
	public List<String> getStudents() {
		return students;
	}
	
	public void setStudentName(List <String> students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "Course [" +
				"name='" + name + '\'' +
				", teachers=" + teachers +
				", students=" + students +
				']';
	}
}
