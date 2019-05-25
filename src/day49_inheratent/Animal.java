package day49_inheratent;

public class Animal {
	private String type;
	//super();
	public Animal(){
		System.out.println("Animal Constructor");
		type = "undefined";
	}
	public Animal(String type){
		System.out.println("constructor arg 1");
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
