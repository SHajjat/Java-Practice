package day52_Inheriitance05;

public class FinalVariables {
	
	// 1) you can not change the value for final
	// 2) final instance variable need to be assgined at intiation (same statment ) ,in constructor or in init block
	// 3) local variable you can declare and assgin value later in the code
	public final int ROADSTER_MAX_RANGE1 = 1;
	public final int ROADSTER_MAX_RANGE2;
	public final int ROADSTER_MAX_RANGE3;
	
	
	public FinalVariables(){ ROADSTER_MAX_RANGE2 = 0;}
	
	public FinalVariables( int max){ // inside constructor
		ROADSTER_MAX_RANGE2 = max; // you can assgin from the value passed to the constructor
		// if you create multiple instances everyone will have its own FINAL
	}
	{ROADSTER_MAX_RANGE3=3;} // inside init block
	
	//There is two places for static final
	// 1) in the same satatment
	// 2) in static block static {}
	public static final int staticNumber1 = 1; // it can also be static examples in Math class are PI and E
	public static final int staticNumber2;
	static{staticNumber2=2;}
	static{letsTryThis = "it does work!!!!!!!";} // now whaaaaattttttttttttttttttttttt?????????
	public static final String letsTryThis;
	
	public final void  range(){}
	
	public static void main(String[] args) {
	
		 final int MAX_PASSENGERS_COUNT = 5;
		 //final variables cant be changed after assignment
		final double DISCOUNT =15;
		final int SSN ;
		SSN = 342342342;// you can assign after initiating only in static methods
		System.out.println("Final Roadster_MAX_RANGE1 "+ new FinalVariables(3).ROADSTER_MAX_RANGE1);
		Math.exp(3);
		int a =Integer.MAX_VALUE; // its not a statment without priniting or putting in sout
		// this all are final ^ final classes
		System.out.println(letsTryThis);
		
		
}
}
