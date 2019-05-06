package day05_math_operators;

public class companyWarmUp {

	public static void main(String[] args) {
		
	    String companyName="Facebook" ,address ="California" ;
		int numberOfEmployees = 100000;
		long revenue = 10L;// always remember to put L at the end of long
		boolean isTechCompany = true;
		char a = '3';
		System.out.println("Company name is "+ companyName );
		System.out.println("Company address "+ address);
		System.out.println("Number of employees "+ numberOfEmployees);
		System.out.println("Annual revenue"+ revenue);
		System.out.println("Is it tech company"+ isTechCompany);//to print with + you need String in the system 
		//System.out.println
		String aboutCompany = companyName + " located at: "+ address + " is a " +
		numberOfEmployees +"\n \\ \tcompany revenue is around " + " an interesting fact about the company " ;
        //System.out.println(a + revenue);
	    System.out.println(aboutCompany);
	
        String ana = aboutCompany + revenue + aboutCompany;
	}   

}
