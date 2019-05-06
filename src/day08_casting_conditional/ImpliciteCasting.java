package day08_casting_conditional;

public class ImpliciteCasting {

	public static void main(String[] args) {
		short shortValue = 3455;
		int valueInt = shortValue;// optional (int)
		System.out.println("int value :"+valueInt);
		double price = 345;
		System.out.println("price after casting : " +price);
		int price1 = 435450;
		double priceDouble = price1;
		System.out.println("price as double : "+priceDouble);

	}

}
