package day51_inheratence04;

public class JuiJitsu extends Excercise {
	public JuiJitsu() {
	
	}
	public JuiJitsu(int minutes) {
		super(minutes);
	}
	
	public int perform (int minutes){
		System.out.println("Doing JuiJitsu");
		
		return 12*minutes;
	}
}
