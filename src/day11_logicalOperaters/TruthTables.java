package day11_logicalOperaters;

public class TruthTables {

	public static void main(String[] args) {
		System.out.println("#### Truth table for && operator");
		System.out.println("When true && true - result is "+(true && true));
		System.out.println("When true && false - result is "+ (true && false));
		System.out.println("When false && true - result is "+ (false && true));
		System.out.println("When false && false - result is "+ (false && false)+"\n");
		
		
		System.out.println("#### Truth table for || operator");
		System.out.println("When true  || true - result is "+(true || true));
		System.out.println("When true || false - result is "+(true || false));
		System.out.println("When false || true - result is "+(false || true));
		System.out.println("When false || false - result is  "+(false || false)+"\n");
		
		
		System.out.println("#### Truth table for ! operator");
		System.out.println("When !true - result is " + (!true));
		System.out.println("When !false - result is "+ !false);
	}

}
