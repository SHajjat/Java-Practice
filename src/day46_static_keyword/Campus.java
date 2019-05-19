package day46_static_keyword;

public class Campus {
	private String city;
	
	static { // static block when you want to run something before anything else run
		System.out.println("static block ran first thing");
		
	}
	public Campus (String city){
		
		System.out.println("Constructor");
		this.city=city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public static void CampusInfo(){
		System.out.println("Welcome to the jungle ");
	}
}//code in static block executes once and before everything else.......
