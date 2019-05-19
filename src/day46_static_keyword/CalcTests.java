package day46_static_keyword;

public class CalcTests {
	public static void main(String[] args) {
		double result = Calculator.plus(55,7);//static way
		System.out.println("the result is "+result);
		
		
		result = Calculator.minus(44,14);
		System.out.println("the result is "+result);
		
		
		
		//also can be called through method
		
		Calculator c = new Calculator();
		System.out.println(c.multiply(4,2));
		int i = Integer.parseInt("500");// it a static method because it been called static way
		System.out.println(i);
		System.out.println(Character.isDigit('1'));
		
	}
}
