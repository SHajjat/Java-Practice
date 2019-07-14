package DateTimeAPI_LAMBDA;

public class Z {
	public static void main(String[] args) {
		X x = new X(1){
			
			@Override
			public void hello(int i) {
				System.out.println(i);
			}
		};
		System.out.println(x.i);
	}
}
