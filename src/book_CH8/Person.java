package book_CH8;

public class Person {
	private String name;
	public Person(){
		this.name = "no name yet";
	}
	public Person (String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void writeOutput(){
		System.out.println("Name: "+name);
	}
	public boolean hasSameName(Person otherPerson){
		return name.equalsIgnoreCase(otherPerson.name);
	}
	public final void specialMethod(){}// this method cant be overridded because its final
	//when a method is declared as final, the compoler knows more about how it will be used ,
	// and so the compiler can generate more efficient code for the method

}
