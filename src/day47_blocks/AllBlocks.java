package day47_blocks;

public class AllBlocks {
	static int staticInt;
	int nonStaticInt = 10 ;
	static { System.out.println("Static Block - I run first and once"); staticInt--; }// static can only take static
	
	{
		System.out.println("INIT Block - I run each object is created before constructor");
		nonStaticInt+=5;
		staticInt+=5;
	}
	
	public AllBlocks(){
		System.out.println("constructor - I run each time object is created after init block");
		nonStaticInt+=3;
		staticInt+=3;
	}
	
}
