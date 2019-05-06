package day27_arrays05;
import java.util.*;
public class Times {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("what is the first time ");
	int time1 []= {scan.nextInt(), scan.nextInt()}; //hours 1 - 24 and min 0 - 59
    System.out.println("what is the next time");
    int time2 []= {scan.nextInt(), scan.nextInt()};
	
    int time = ((time1[0]-time2[0])*100 +(time1[1]-time2[1]));
    String timeis = (time1[0]-time2[0])*100 +(time1[1]-time2[1]) >0 ? "time one is bigger": (time1[0]-time2[0])*100 +(time1[1]-time2[1]) ==0 ? "they are the same time":"time two is bigger";
    System.out.println((time1[0]-time2[0])*100 +(time1[1]-time2[1]) >0 ? "time one is bigger": (time1[0]-time2[0])*100 +(time1[1]-time2[1]) ==0 ? "they are the same time":"time two is bigger");

	//References  Jonghee Lee Tuesday , May 9th 2019
//    Scanner scan = new Scanner (System.in);
//    int [] time1 = new int[2];
//    int [] time2 = new int[2];
//    String [] arr = {"hour", "min"};
//    
//    
//    for (int i=0; i<2; i++){
//        System.out.println("Give " + arr[i]+ " for time 1");
//        time1[i] = scan.nextInt();
//        
//        
//    }
//    for (int i=0; i<2; i++){
//        System.out.println("Give " + arr[i]+ " for time 2");
//        time2[i] = scan.nextInt();
//    }
	
	
}
}
//2100 15 ==> 2300-2300 + 15 -50
//2300 50 

