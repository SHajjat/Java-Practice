package day04_primitives_operatior;

public class UsingVariables {
	public static void main(String[] args) {
		int num1 =100 , num2 , num3;
		
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		num2 = 200;
		num1 = num2;
		num3 = num1;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		// declare apples and assign 25, declare kiwis and assgin values of apples to it
		int apples = 25, kiwis = apples , mangoes = 55;
		kiwis = mangoes ;
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
	}

}
