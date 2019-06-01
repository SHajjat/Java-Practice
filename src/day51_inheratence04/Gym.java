package day51_inheratence04;

public class Gym {
	public static void main(String[] args) {
		Excercise ex = new Excercise(1);
		JuiJitsu ju = new JuiJitsu(1);
		Running ru = new Running(1);
		Swimming sw = new Swimming(1);
		Yoga yo = new Yoga(1);
		System.out.println(ex.perform(1));
		System.out.println(ju.perform(1));
		System.out.println(ru.perform(1));
		System.out.println(sw.perform(1));
		System.out.println(yo.perform(1));
		Sprinting sp = new Sprinting();
		System.out.println(sp.perform(1));
		Snowboarding sm = new Snowboarding();
		System.out.println(sm.perform(1));
		}
		
	}

