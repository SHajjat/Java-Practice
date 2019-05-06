package test;

public class HowToSplit {

	public static void main(String[] args) {
		String and = "&-&-&-&-&-&-&";
		String[] andand = and.split("-",3);
		for (String a : andand) {
            System.out.print(a); 
            
		}
		//System.out.println(andand);
		

	}

}
