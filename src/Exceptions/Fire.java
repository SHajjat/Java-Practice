package Exceptions;

public class Fire {
	public static void main(String[] args) throws Exception {
		try {
			playWithFire();
		}catch ( Throwable e){
			e.getMessage();
		
		}
		
		try {
			playWithFire();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		
	}
	
	public static void playWithFire() throws Throwable{
		System.out.println("Do something dangares");
		
	}
}
