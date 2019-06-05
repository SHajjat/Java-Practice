package day44_Constructor;



public class Jobs {
	/*
	 * 	Job class
	 * 
	 * 	 title , company , annualSalary 
	 *   
	 *   Encapsulate above private instance fields 
	 *   Create no arg constructor 
	 *   	to set title, company to "undefined"
	 *   	
	 *   Create 1 arg constructor to set title
	 *   Create 3 arg constructor to set all 3 fields 
	 *   
	 *   create a method called toString 
	 * */ 
	
	private String title , company ;
	private double annualSalary;
	
	//constructor cant be called form a method, but you can call method to constructor
	
	
	public Jobs () {
		System.out.println("No Args Constructor ");
		this.title = "undefined";
		this.company = "undefined";
	}
	
	public Jobs( String title) {
		System.out.println("ONE ARG CONSTRUCTOR");
		setTitle(title);//example of method called in constructor
		this.company = "udefined";
	}
	
	public Jobs (String title ,String company, double annualSalary) {
		System.out.println("3 arg constructor");
		
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary ;
		
	}
	public Jobs ( int annualSalary ) {
		this.annualSalary = annualSalary;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		
		return "\n Job ["+title+"]"+"["+company+"]"+"["+annualSalary+"]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	

}
