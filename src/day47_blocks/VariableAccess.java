package day47_blocks;

public class VariableAccess {
	public int myInstatnceVar=40;
	public static int myStaticVariable = 55;
	
	
	public static void main(String[] args) {//main method is static cant access non static
	//	System.out.println(myInstanceVar); //cannot access non-static from static
		System.out.println(myStaticVariable);// ok baba
		VariableAccess baba = new VariableAccess();
		//create object of variableAcess and print myInstanceVar
		System.out.println(baba.myInstatnceVar);
		System.out.println(new VariableAccess().myInstatnceVar);
		System.out.println("access static variable using instatnce "+baba.myStaticVariable);
		System.out.println("accessing static variable using class name "+VariableAccess.myStaticVariable);
		
		
		
	}
}
