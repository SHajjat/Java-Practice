package day56_abstraction02;

public class Netscape extends Browser {
	//has to be same or more visible
	public void navigate (String url){
		System.out.println("Netscape - navigating to "+url);
	}
	public void displayWebpage(){
		System.out.println("Netscape - displaying ");
	}
	public  boolean isLaunch(){
		System.out.println("Netscape - is launching");
		System.out.println("1 2 3 you and me");
		return false;
	}
	@Override
	public void close(){
		super.close();
		System.out.println("Welcome to the new world");
		
	}
	
}
