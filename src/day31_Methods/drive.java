package day31_Methods;

public class drive {

	public static void main(String[] args) {
		drive("Audi", 60 , .3);

	}
	public static void drive ( String car , double distance , double time ) {
		double speed = distance/time;
		System.out.println(car + " speed is "+ speed + " MPH");
		boolean ticket = speed - gettingTicket(speed) >0;
		System.out.println(ticket);
		
		}
	public static  double gettingTicket (double speedLimit) {
		speedLimit = 60;
		return speedLimit; 
		
		
		
		
		
	}
		
		
	}

//speed = di/time
