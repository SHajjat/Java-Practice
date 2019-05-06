package day15_StringManupalation;

public class IndexOf {

	public static void main(String[] args) {
		String word1 = "github";
		              //012345
		
		System.out.println(word1.indexOf("g")+ " g");
		System.out.println(word1.indexOf("hu"));
		System.out.println(word1.indexOf("java"));//if its not there it will give -1
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("position of dot "+ index);
		System.out.println(url.charAt(index+1));
		//find position of '-' and check if space is on right or left size
		
		String title = "java - Google Search";
		index = title.indexOf("-");
		if (title.charAt(index-1) == ' ') {
			System.out.println("its on the left");
		if (title.charAt(index+1) == ' ')
			System.out.println("its on the right");
		}
		
		String country = "United States of Amrekya";
		int space = country.indexOf("States" );
		System.out.println("position of states " +space);
		
		
		String word2 = "java , C++ , python , tomcat , eclipse ";
		//check if C++ is in the word2
		//you can use contain
		if (word2.contains("C++"))
			System.out.println("C++ is there");
		else 
			System.out.println("C++ is not there ");
		
		
		if (word2.indexOf("C++")!= -1)
			System.out.println("C++ is there");
		else 
			System.out.println("C++ is not there ");
			

	}

}
