package day40_customclasses_methods;

public class Employee {
	public String name , jobTitle;// can be used anywhere in project
	 double salary;// can only be used in same package
	
	
	
	public void work() {
		
		System.out.println(name + " \" is Working \" ");
	}
	
	public void goToBreak () {
		System.out.println(name + " is on a break");
		
	}
	public void attendMeeting() {
		System.out.println(name + " is in a meeting");
		
		
	}
	
	public void intoduce() {
		System.out.println("Hello my name is "+ name);
		System.out.println("I work as "+jobTitle);
		System.out.println("Those Motherfu only pay me "+ salary);
		
	}
}
