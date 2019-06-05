package mentoring_2;

public class Example_1 {
	
	public static void main(String[] args) {
		//Warm up 1:
		
		int x = 5; 
		System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
		
		
		//Warm up 2
		int y = 5; 
		System.out.println((y > 5) ? 21 : "Zebra");
		}

		
	
	
	
	//Example 1 Warmup-1 > close10
	public int close10(int a, int b) {
		 
		
		return Math.abs(10-a)<Math.abs(10-b)? a : ( Math.abs(10-a)>Math.abs(10-b)? b:0)  ;
		
		}
	
	
	//Example 2 Warmup-1 > monkeyTrouble 
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  
		  return !( aSmile ^ bSmile);// exclusive OR
	}
	
	//Example 3 Warmup-2 > arrayCount9
	
	public int arrayCount9(int[] nums) {
		  int count = 0;
		  for (int temp : nums){
		    count = temp==9?++count:count;
		  }
		  return count;
		}
	
	//Example 4 Array-1 > double23 
	public boolean double23(int[] nums) {
		  int count2=0,count3=0;
		  for (int num :nums){
		    count2= num==2?++count2:count2;
		    count3=num==3?++count3:count3;
		    
		  }
		  return count3==2 || count2==2;
		}
	
	
	//Example 5 Array-1 > fix23 
	public int[] fix23(int[] nums) {
		  for (int i = 0 ; i<nums.length-1 ;i++){
		    nums[i+1] = nums[i]==2 && nums[i+1]==3?0:nums[i+1];
		  }
		  return nums;
		}
	
	
	//Example 6 Warmup-1 > max1020
	public int max1020(int a, int b) {
		  boolean Arange = a>=10 && a<=20?true:false;
		  boolean Brange = b>=10 && b<=20?true:false;
		  return Arange && ( a>b || !Brange)?a: Brange && ( a<b || !Arange)?b:0;
		}

	
}
