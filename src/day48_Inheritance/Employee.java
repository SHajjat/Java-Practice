package day48_Inheritance;
           //Employee  is  A  Person
public class Employee extends Person {
	String jobTitle;
	
	public void work(){
		System.out.println(name +" is working as "+jobTitle);
	}
}
