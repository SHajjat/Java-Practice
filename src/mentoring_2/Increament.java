package mentoring_2;

public class Increament {
public static void main(String[] args) {
	int [] num = {1, 9, 9, 3, 9};
	System.out.println(arrayCount9(num));
	
	
}
	public static int arrayCount9(int[] nums) {
		  
		int count = 0;
		  for (int temp : nums){
		    count = temp==9?count++:count;
		  }
		  return count;
		}

}
