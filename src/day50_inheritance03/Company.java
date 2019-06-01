package day50_inheritance03;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		FullTimeEmployee full = new FullTimeEmployee();
		Contractor cont = new Contractor();
		emp.CalculatePay(40 ,40);
		full.CalculatePay(40, 40);
		cont.CalculatePay(40,55);
		
	}
}
