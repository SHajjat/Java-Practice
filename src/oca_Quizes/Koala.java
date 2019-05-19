package oca_Quizes;

public class Koala {
	public static int count = 3;
	
	public  void test( int x){
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		System.out.println(count);
		System.out.println("hello World");
		
		Koala koala = new Koala();// you call classes not methods man
		koala.test(10);
		System.out.println("called through the class " +Koala.count);
		if (count++<6)
		Koala.main(new String [0]);// thats how you call main method man
		//how "AMAZING" is that
		
	}
}
