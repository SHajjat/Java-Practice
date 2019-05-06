package day10_ifStatment;

public class IfStatmentWithBooleanVariable {
public static void main(String[] args) {
	boolean isBreakTime= true;
	if(!isBreakTime) {
		System.out.println("Break until 8:35 Pm");
		
	}else{
		System.out.println("Not Break time yet habibi");
		//or you can do (isBreakTime == true)
	}
	
	int hour = 50;
	if (!(hour > 100))
		System.out.println("go home man");
		
}
}
