package homeWorks;
import java.util.*;

public class FindOdd {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    int sum=0;
		    //TODO: write your code below
		    String initial = "";
		    for (int i=0;i<nums.length;i++){
		      
		      sum = initial.contains(" "+nums[i]+" ")? sum-nums[i]:sum+nums[i];
		        
		       initial+=" "+nums[i];  
		      
		      
		     
		    }
		    System.out.println(sum);
	}

}
