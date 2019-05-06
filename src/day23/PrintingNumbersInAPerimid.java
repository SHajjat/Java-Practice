package day23;

public class PrintingNumbersInAPerimid {
	public static void main(String[] args) {
		int k = 9;
		int l=1;
		for (int j =1 ; j<=9;j++) {
			for (int i=1 ;i<=9 ; i++) {
				
				System.out.print(l);
				System.out.print(k);
			}
			k--;
			l++;
			System.out.println();
			
		}
	}

}





//15355
//2444
//335
//42
//5 