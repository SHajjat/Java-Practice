package oca_Quizes;



public class Employee {
	String name;
	boolean contract;
	double salary;
	Employee(){
		name ="joe";
		contract =Boolean.TRUE;
		salary = 100.0f;
		
	}
	public String toString(){
		return name+":"+contract+":"+salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.toString());
	}
}
