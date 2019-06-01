package day51_inheratence04;

public class Snowboarding extends Excercise {
	public int perform (int minutes){
		int cal =super.perform(10);//general excercise for 10 min
		System.out.println("+++++++++++++++++++++");
		System.out.println("Snowboarding for "+ minutes+ " minutes");
		return minutes*10+cal;
	}
}
