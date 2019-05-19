package day46_static_keyword;

public class Customer {
	private String name ;// if we change to static there is only one copy for eveyone if you change it for one you change it for all
	
	// like a mail box, its static its shared it central , mail man you and your roomates have access to the box
	private String email;
	int count ;
	static int count2;
	
	public Customer(){
		this.email="unknown";
		this.name = "unknown";
	}
	
	public Customer(String email , String name){
		this.email = email;
		setName(name);
		count++;
		count2++;
	}
	
	
	
	public String getName (){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
		
	}
	public void setName (String name){
		this.name = name;
	}
	
	public String toString (){
		return "Customer [name="+name+",email="+email+"]";
	}
}
