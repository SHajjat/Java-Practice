package day51_inheratence04;

public class Excercise {
	public int minutes;
	public Excercise() {
	}
	public Excercise(int minutes) {
		this.minutes = minutes;
	}
	
	public int perform (int minutes){
		System.out.println("Doing general excercise");
		
		return 4*minutes;
	}
}
