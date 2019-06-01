package day51_inheratence04;

public class Swimming extends Excercise {
	public Swimming() {
	
	}
	public Swimming(int minutes) {
		super(minutes);
	}
	
	public int perform (int minutes){
		System.out.println("Swimming");
		
		return 11*minutes;
	}
}
