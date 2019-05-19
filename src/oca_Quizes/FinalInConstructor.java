package oca_Quizes;

public class FinalInConstructor {
	private final double volume ;
	
	
	public FinalInConstructor(double length){
		this(length , 1);
	}
	public FinalInConstructor(double length , double width){
		this(length,width, 1);
	}
	
	public FinalInConstructor (double length , double width , double height){
		volume = length*width*height;
	}
}
