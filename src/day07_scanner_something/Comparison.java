package day07_scanner_something;

public class Comparison {

	public static void main(String[] args) {
		//==
		System.out.println(5 == 5);
		System.out.println(50==5);
        int searchCount = 5000;
        System.out.println(searchCount == 5000);
        String a = "2";
        System.out.println(a.equalsIgnoreCase("5"));
        
        
        int speedLimit = 55;
        int currentSpeed = 75;
        System.out.println(currentSpeed == speedLimit);
        boolean atLimit = currentSpeed == speedLimit;
        System.out.println(("at speed limit: " + atLimit));
        boolean overSpeedLimit = currentSpeed > speedLimit;
        System.out.println("over Speed limit " + overSpeedLimit);
        boolean underLimit = !overSpeedLimit;
        System.out.println("less than the limit : "+ underLimit);
        double balance = 150.0;
        boolean broke = balance <=0.0;
        System.out.println(broke);
        double transaction = 155.5;
        broke = (balance - transaction)<0;
        System.out.println(broke);
        System.out.println(balance);
        		
	}  

}
