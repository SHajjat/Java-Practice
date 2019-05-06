package homeWorks;
import java.util.*;
public class HTML {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String html = scan.nextLine();
		    if (html.contains("html")){
		     html =(html.substring(html.indexOf("id")));
		     System.out.println(html.substring(4, html.indexOf('>')-1));
		      
		    }else{
		      System.out.println("Invalid input!");
		    }
		    
//		    System.out.println(html.indexOf("id"));

	}

}
