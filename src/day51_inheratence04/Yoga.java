package day51_inheratence04;

public class Yoga extends Excercise {
	public Yoga() {
	
	}
	public Yoga(int minutes) {
		super(minutes);
	}
	
	public int perform (int minutes){
		System.out.println("Doing Yoga");
		
		return 5*minutes;
	}
}
