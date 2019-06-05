package Day54_InheritanceReview;
import java.util.*;
import oca_Quizes.oca_LamdaExample.Test;

public class BlockPractice {
	static String name = "Samir";
	
	static {
		name = "not Samir";
		
	}
	
//		public BlockPractice(float a){
//			System.out.println("float");
//	}
	static Scanner scan = new Scanner(System.in);
	public BlockPractice(double b) {
		System.out.println("Double");
		
	}
}
class test extends  BlockPractice{
    public test()	{
    	super(3.5f);
	}
	
	public static void main(String[ ]  args) {
		
		for (char i = 'z'; i>='v';i--){
			for (char j ='z';j>='v';j--){
				System.out.println(""+i+j);
			}
			
		}
	}
	}

