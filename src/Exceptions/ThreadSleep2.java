package Exceptions;

public class ThreadSleep2  {
	public static void main(String[] args) {
		System.out.println("begining");
		try {
			
			
			Thread.sleep(100);
		}catch (InterruptedException e){
		
		}
		System.out.println("End");
		
		
		try{
			//throw new Exception();
			//throw new Throwable();
			new RuntimeException();// it is created but not being thrown by JVM and it will be Garb collected
			System.out.println("Code here will show up unless you add throw");
			
			
		}catch (Throwable e){
		
		}
	}
}
