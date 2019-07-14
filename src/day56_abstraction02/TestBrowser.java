package day56_abstraction02;
         /*
         //Browser br = new Browser(); abstract browser cant be instantiated
		  we use abstract keyword to make a class abstract.
		  we can not create an object or instantiate an abstract class
		  what is abstract?
		  method without body/implementation , can be place in either abstract class or interface
		  by writing abstract method we worry about name of the behavior/method and not worry about
		  implementation/body.
		  it ends with ; and no body {} even if its empty
		  where do you add implementation (what should happen)
		  implementation/body for abstract method is added in concert class
		  (first non abstract class extending the class)
		  while adding implementation, all rules of overriding needs to be followed
		  IQ: can we add non-abstract method into abstract class ?
		  **Si Senor** abstract class can have both abstract and non-abstract methods
		  IQ: is it mandatory for abstract class to have abstract methods ?
		  **Si Senor** its not mandatory to have abstract methods
		  IQ : can you add constructor to an abstract class?
		  yes you  can have constructor  but keep in mind you can not create objects ** which is weird if you ask me
		 the constructor can be called from the subClass using super();
		 
		 IQ : can you add instant or static variable to abstract classes ?
		 Yes you can add both types of variables in to abstract classes.
		 
		 ***there no such thing called abstract variable in java
		 
		 IQ: can an abstract class extend another abstract class?
		 yes man , why would you even ask that,
		 
		 IQ: can an abstract class extend a non abstract class ?
		 yes we can
		 
		 IQ : can we add static method to abstract class
		 yes
		 IQ : can a method be abstract and final in abstract class?
		 no , abstract methods are meant to be overriden .
		 IQ : can abstract method be protected , default or private ?
		 it can be protected ,default but not private
		 
		 *///notes
public class TestBrowser {
	public static void main(String[] args) {
		Browser.id = 100;
	
	
	}
}
