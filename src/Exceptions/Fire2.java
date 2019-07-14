package Exceptions;

public class Fire2 {
	public static void main(String[] args){// throws Exception { this only pass responsability to the next person
		try{
		
		}finally {
		
		}
		
		
		try {
			playingWithFire();
		} catch (Exception e) {
			e.printStackTrace();
		}
		playWithWater();
	}
	static void playingWithFire() throws Exception{
		System.out.println("playing with fire");
		//throw new RuntimeException();
		throw new Exception(); // checked exceptions need to be handled
	}
	
	static void playWithWater() throws RuntimeException{
		System.out.println("Play with Water");
		
	}
	
	
}
