package Assesmant;

public class ArraysInitialValue {
	public static void main(String[] args) {
		
		String str = "100,100,20".replace(",","");
		//int number = Integer.parseInt(str);
		int number = Integer.valueOf(str);
		System.out.println(number);
		int [] nums = new int [3];
		for (int num : nums){
			System.out.print(num +" : " );
		}
	}
}
