package oca_Quizes;

public class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	private static final String Static;
	private final String nonStatic;
	{ nonStatic = "1"; }
	static { Static = ""+(1*3)+""; }
	
	public Mouse( int numTeeth){
		this(numTeeth,6);
		
	}
	public Mouse(int numTeeth, int numWhiskers){
		this(numTeeth, numWhiskers, 4);
	}
	public Mouse(int numTeeth, int numWhiskers , int weight ){
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		
	}
	private void print() {
		System.out.println("numTeeth "+ numTeeth+" numWhiskers "+ numWhiskers +" weight "+weight);
		
	}
	
	public static void main(String[] args) {
		
		Mouse faar1 = new Mouse(1);
		System.out.println("mouse 1");
		System.out.println(faar1.numTeeth);//1
		System.out.println(faar1.numWhiskers);//6
		System.out.println(faar1.weight);//4
		
		Mouse faar2 = new Mouse(2, 2);
		System.out.println("mouse 2");
		System.out.println(faar2.numTeeth);//2
		System.out.println(faar2.numWhiskers);//2
		System.out.println(faar2.weight);//4
		
		Mouse faar3 = new Mouse(3 , 5,6);
		System.out.println("mouse 3");
		System.out.println(faar3.numTeeth);//3
		System.out.println(faar3.numWhiskers);//5
		System.out.println(faar3.weight);//6
		
		faar1.print();
		faar2.print();
		faar3.print();
		
	}
}
