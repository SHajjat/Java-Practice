package day51_inheratence04;

public class Running extends Excercise {
	public Running() {
	
	}
	public Running(int minutes) {
		super(minutes);
	}
	
	public int perform (int minutes){
		System.out.println("Running");
		
		return 10*minutes;
	}
}
