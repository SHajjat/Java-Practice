package day31_Methods;
//if we are getting a method from another package we need to import it first
import day30_methods2.*;//for example if we want to import something in day30

public class CalculatorTest {
	public static void main(String[] args) {
		System.out.println(Calculator.multiply(Calculator.add(1, 2),Calculator.add(2,1)));
		Calculator.print(Calculator.opertaion( 1,"+",0));
	}

}

/*If you call a class from a different package, you will need to import it first.

package p1;
public class A {
	public static void m1() {
		System.out.println("hello");
	}
}

package p2;
import p1.A;

public class B {
	public static void main(String[] args) {
		A.m1();
	}
}
 * 
 */






