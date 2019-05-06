package day04_primitives_operatior;

public class StringsConcat {
	public static void main(String[] args) {
		String firstName = "Samir", natunality = "Ane ordone" , job = "SDET", company= "umk malha";
		System.out.println("My name is " + firstName);
		System.out.println(" 7o6 2edk 3ala rask "+ natunality);
		System.out.println("Sho bshta3'el? " + "ane bsht3'el "+ job + " ya ez3ar");
		System.out.println("ween bshta3'el? "+ company + " btwaj3k eshe?? "/* + "umk bnekha !!!"*/);
		String [] umk = company.split(" ");
		System.out.println(umk[0]);
		int zipcode = 1;
		System.out.println("I live in " + (zipcode +  zipcode) );
		System.out.println(zipcode +""+ zipcode);
		
		
	}
	

}
