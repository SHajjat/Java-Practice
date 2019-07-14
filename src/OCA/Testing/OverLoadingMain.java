package OCA.Testing;

public class OverLoadingMain {
	
	
	public static void main(String[] args) {
		//System.out.println("String "+args[0]);
		System.out.println(new StringBuilder("ABC"));
		
		System.out.println(new S());
	
	}
	
	public static void main(Object[] args) {
		System.out.println("Object "+args[0]);
	}
	
	public static void main(int[] args) {
		System.out.println("int "+args[0]);
	}
}
class S{
	
	String abc = "hello";
	
	
}
