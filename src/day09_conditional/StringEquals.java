package day09_conditional;

public class StringEquals {

	public static void main(String[] args) {
		String str1 = "java";//they were created the same way, assgined
		String str2= "java";
		System.out.println(str1 == str2);//false
		System.out.println(str1 != str2);//false
		System.out.println( (str1).equals(str2));
		System.out.println(str1 == "Java");//false
		System.out.println(str2 == "java");//true
		//equals method
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals("java"));//true
		System.out.println(str2.contentEquals("Java"));//false
		
		//two ways to assgin string
		//1) String today = "Tuesday"; we been using it for a while
		
		//2)using new keyword
		//String today = new String ("Java");
		//String str = new String("Hello");
		
		String month = new String ("March");
		String month2 = new String ("March");
		System.out.println(month == month2);//false its not doing value comparison , it is just checking if month and month2 are pointing to same location in memory ( if you create object it will go to somewhere else other that primitives
        System.out.println(month.contentEquals(month2));//true
        System.out.println(month.contentEquals("March"));//true
        System.out.println(month.equalsIgnoreCase("MaRCH"));//true
        //in the above examples by using equals method java is checking if the values are the same.
        //which is the proper way of comparing Strings
        
	}

}
