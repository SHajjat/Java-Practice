package homeWorks;
import java.util.*;

public class PrintStars {
	public static void main(String[] args) {
		
	
	int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		int n = 3;
		for (i = 1 ; i<=n;i++){
		  for(j=1;j<=i;j++){
		    System.out.println("*");
		  }
		}
}
}
