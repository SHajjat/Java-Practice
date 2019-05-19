package oca_Quizes;

public class OverLoadingVarargs {
	public static void Fly(int [] lengths){
		System.out.println("int array");
	}
	public static void Fly ( int i,int ...length){
		System.out.println("var arg");
	}
	
	public static void main(String[] args) {
		//Fly flyer = new Fly( new int[] {1,2,3});
		Fly(1,1,2,3);
		Fly(new int []{1,2,3});
		
	
	}
}
