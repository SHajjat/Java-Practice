package day50_inheritance03;

public class Contractor extends Employee{
	@Override
	public void CalculatePay(int hours , double rate){
		System.out.println("Contractor total pay " + (hours*rate +200));
	}
}
