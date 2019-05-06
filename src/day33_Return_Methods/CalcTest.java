package day33_Return_Methods;

public class CalcTest {//if its in the same package no need to import
	public static void main(String[] args) {
		System.out.println(Calculator.add(1, 2));
		System.out.println(Calculator.multiply(100, 2));
		System.out.println(Calculator.divide(100, 2));
		System.out.println(Calculator.minus(100, 4));
		double addResult = Calculator.add(50, 40);
	}
	

}
