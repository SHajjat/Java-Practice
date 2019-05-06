package day31_Methods;

public class GoogleSearch {
	public static void main(String[] samir) {
		googleSearch("About 19,600,000 results (0.73 seconds)");
		
		
		
	}
	
public static void googleSearch (String search)	{
	String [] arrSearch = search.split(" ");
	String count = arrSearch[1].replace(",", "");
	String time = arrSearch[3].substring(1);
	System.out.println("Results counts : "+count);
	System.out.println("Time taken : "+time);
	
}

}
