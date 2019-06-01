package day52_Inheriitance05;

public class FinalMethod {
	public final void method1(){
		System.out.println("final method 1");
	}
	public final void metho1(String a){ // you can overload since java look at overLoaded method as a different method
	
	}
	
	final static void stringFinal(){
		System.out.println("Hello is it me you looking for , i can see it in your eyes , i can see it in your smile .....");
	}
	
	class sub extends FinalMethod{
		// you cant override a fina method*********
//		public final void method1(){
//			System.out.println("final method 1");
//		}
		
		public final void method1(String a , String b){// you can overload since java look at overLoaded method as a different method
			System.out.println("final method 1");
		}
	
	}
	
	
}
