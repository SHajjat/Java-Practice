package Day54_InheritanceReview;
class Parent{
public void method1(){ }
	Parent(){
	
	}
public static void method2(){ // static method
	System.out.println("Method2");
}
}
public class InheritanceReview extends Parent {
	        // subClass               parentClass
	
	InheritanceReview(){
	
	
	}
	public static void main(String[] args) {
		method2();
	}
	
}
