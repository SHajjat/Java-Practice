package homeWorks;
import java.util.*;
import java.math.*;
public class DiagonalDifference {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
		                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
		                            };
		    int result = matrix[1][1]+matrix[3][3]-matrix[1][3]-matrix[3][1];
		    
		    // FINAL PRINT
		    System.out.println(Math.abs(result));

	}

}
