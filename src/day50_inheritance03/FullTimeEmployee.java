package day50_inheritance03;

public class FullTimeEmployee extends Employee{
	@Override
	public void CalculatePay(int hours , double rate){
		System.out.println("Full time  total pay " + (hours * rate * 1.05));
	}
}
