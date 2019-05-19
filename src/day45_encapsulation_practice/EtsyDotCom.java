package day45_encapsulation_practice;

public class EtsyDotCom {
	public static void main(String[] args) {
		EtsyAccount acct1 = new EtsyAccount();
		System.out.println(acct1.toString());
		acct1.setfirstName(" ");
		acct1.setEmail("Samirhajjatgmail.com");
		acct1.setpassWord("abc12s");
		System.out.println(acct1.toString());
		
		EtsyAccount acct2 = new EtsyAccount("helis@gmail","SAMI", "SASSAAASA");
		System.out.println(acct2.toString());
		
		EtsyAccount acct3 = new EtsyAccount("hajsa@gms","samirr" );
		System.out.println(acct3.toString());
	}
}
