package day07_scanner_something;

public class PreAndPost {

	public static void main(String[] args) {
		int num= 0;
		int num2= num++;//it will assign num to num2 then add 1 to num
		System.out.println("num ;"+ num);
		System.out.println("num2 :"+ num2);
		
		int n = 0;
		int n2 = ++n;
		System.out.println("n :"+ n);
		System.out.println("n2 : "+ n2);
		
		int i = 10;
		int j = ++i;//
		j = i++;//assgin i to j first then add i
		
		
		int banana = 6;
		int pears = banana++;
		int apples= ++banana;
		System.out.println("bananas : " + banana);
		System.out.println("pears : "+pears);
		System.out.println("applese : "+ apples);
		
		int friends = 10;
		System.out.println(friends++);//post increament so it will print 10
		System.out.println(friends);//print 11
		
		int p1 = 10;
		int sum = p1++ + 5;//it will print 15 since sum = p1 and then +5 p1 is 11 now
		System.out.println("sum : "+sum);
		
		int batteries = 8;
		int oldBatt = 5;
		                  //    8        + (5+1) = 14
		int totalBatteries = batteries++ + ++oldBatt;
		System.out.println("batteries "+ batteries);//9
		System.out.println("old Batt :" + oldBatt);//6
		System.out.println("total batt : "+ totalBatteries);//14
		
			
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
	}

}
