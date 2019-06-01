package day50_inheritance03;

public class IphoneApp extends App{
	private String developer;
	//public static int count;( overridding)
	//if the superClass has no zero arg constuctor you need to
	//1. add constructor
	//2. call super constructor
	public IphoneApp(){
		super("Uknown");
	}
	public IphoneApp(String name){
		super(name);
		count++;
	}
	
	
}
