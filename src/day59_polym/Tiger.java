package day59_polym;

public class Tiger extends Animal{
	public  void talk(){
		System.out.println("Tiger talking");
	}
	
	@Override
	public String toString() {
		return "Tiger";
	}
	
	public static void main(String[] args) {
		Animal AT = new Tiger();
		AT.talk();
	}
}
