package day08_casting_conditional;

public class Relationals {

	public static void main(String[] args) {
		double d1 =23.56;
		double d2 = 20.43;
		 System.out.println(d1>=d2);
		 boolean check = d1>=d2;
		 System.out.println("check :"+check);
		 char ch1='a';
		 char ch2 = 'j';
		 char ch3 = 'A';
		 System.out.println(ch2>ch1);//true , meaning 'j'>'a' as a value
		 System.out.println(ch1>ch3);//true , meaning 'a'>'A' as value 97>65 (from chart online)
        boolean a = true ==false ; 
	    System.out.println("a : "+a);
	    boolean b = true !=false;
	    System.out.println("b : "+ b );
	    

	}}
