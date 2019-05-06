package homeWorks;
import java.util.*;
public class Zombies2 {
	public static void main(String[] args) {
//		3
//		6
//		0
//		4
//		3
//		2
//		7
//		1
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
		int min = Integer.MIN_VALUE;
		  int sum;
		    int j=0;
		    do{
		      sum=0;
		    System.out.print("Day "+j+" ");
		    System.out.println(Arrays.toString(inhabitants));
		    j++;
		    for (int i = 0 ; i < inhabitants.length; i++){
		     
		      inhabitants[i]/=2;
		      sum+=inhabitants[i];
		    }
		    
		      
		      
		    }while(sum>0);
		    System.out.println("---- EXTINCT ----");

	}

}
