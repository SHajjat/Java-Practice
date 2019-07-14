package DateTimeAPI_LAMBDA;

import java.util.ArrayList;
import java.util.List;

public  interface AIntro extends BIntro {
	void run(int i);
	List<Integer> list = new ArrayList<>();
	
	default void getName(){
		System.out.println("AIntro is asking for your name");
	}
	default void Aing(){
	
	}
}
