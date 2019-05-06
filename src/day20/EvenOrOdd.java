package day20;

public class EvenOrOdd {
//sum of even and odd numbers between 1 and 100
	public static void main(String[] args) throws InterruptedException {
		int sumOfEven = 0;
		int sumOfOdd = 0;
		String evens = "";
		String odds = "";
		
		for (int i = 1 ; i <=100 ; ++i) {
			if (i%2 == 0) {
				sumOfEven+=i;
				//System.out.print(i + " + ");
				evens += " "+i;
				
			}else {
				sumOfOdd+=i;
				odds += " "+i;
				
			}
			
		}
		System.out.println(evens);
		System.out.println(odds);
		System.out.println("sum of evens = " + sumOfEven);
		System.out.println("sum of odds "+ sumOfOdd);
	}

}
