package book_CH8;

import java.security.PublicKey;

public class TitledPerson extends Person{
	private String titel;
	public TitledPerson(){
		super();
		titel="unknown";
	}
	public TitledPerson(String name , String titel){
		super(name);
		setTitel(titel);
		this.titel = getTitel();
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	@Override
	public void writeOutput (){
		super.writeOutput();
		System.out.println("his title is "+titel);
		
	}
	public void reset(String name , String titel){
		setName(name);
		this.titel = titel;
	}
	
	public boolean equals( TitledPerson person){
		return this.hasSameName(person) && this.titel.equalsIgnoreCase(person.titel);
	}
}
