package day46_static_keyword;
import static java.lang.Math.*;

public class CompanyTest {
	public static void main(String[] args) {
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
		System.out.println(Math.round(3.4444444));
		System.out.println(round(3.4));

		//
		
		//for print statment System.out.println()
		
		//System --> classname
		//out --> static variable of type printStream class
		//printLn() -- . non-static method of PrintStream
		
		//whenever all of your methods in your class are static and you want everyone to call them static way  (Classname.methodName())
		//then you can simply make you constroctors private
		// look math class
		//Math math =new Math();
		//the only way to call is Math.round(434.4);
		/*
		
		public final class Math {

        Don't let anyone instantiate this class.
     
        private Math() {}
    
    
		 */
		
	}
}
