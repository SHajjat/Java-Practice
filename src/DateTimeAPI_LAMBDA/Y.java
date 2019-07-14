package DateTimeAPI_LAMBDA;

import day57_interface.Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Y extends X{
	public Y(int i) {
		super(i);
	}
	
	@Override
	public void hello( int i) {
	
	}
	
	public static void main(String[] args) {
		Predicate < Long > prL = i -> {return  i > 10L;};
		List< Long > lst = new ArrayList<>();
		lst.add(1L);
		lst.add(9L);
		lst.add(33L);
		lst.add(11L);
		lst.add(10L);
		lst.add(3L);
		
		lst.removeIf(prL);
		System.out.println(lst);
		
	}
}
