package Exceptions;

public class CheckedException {
	public static void main(String[] args) {
		//this is a code that throw exception : Type Interrupted exception
		System.out.println("starting");
		try {
			for ( int i =0;i<6;i++ ) {
				System.out.println("count "+i);
				Thread.sleep(1000); // if you dont handle it it wont compile
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("the end");
	}
}
