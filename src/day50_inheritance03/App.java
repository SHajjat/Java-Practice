package day50_inheritance03;

public class App {
	private String name;
	//static memebers are inheratened as long as the access modifier allows it
	public static int count;// ill pass it to iphoneApp
	
	public App(String name){
		this.name = name;
	}
	
	public static void builtWith(String webSite ,String lang){
		System.out.println("Building "+ webSite + " using "+lang);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
