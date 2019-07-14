package day56_abstraction02;

    abstract  class Browser {//extends TestBrowser {// an abstract class can extend an non abstract class
	String name;
	public static int id;
	
	public Browser() {
		System.out.println("Creating a Brrowser");
	}
	
	public Browser(String name , int id){ // hmmmmmmmmmmmmmmm
		System.out.println("Creating a Brrowser");
		this.id = id;
		this.name = name ;
	}
	protected abstract  void navigate (String url);
	public abstract void displayWebpage();
	public abstract boolean isLaunch();
	public void close(){
		System.out.println("Exitting the Browser.");
	}
	
	
	
	
}
