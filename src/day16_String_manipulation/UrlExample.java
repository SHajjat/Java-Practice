package day16_String_manipulation;

import java.util.*;

public class UrlExample {
	public static void main(String[] args) {
		System.out.println("enter a website");
		String webSite = new Scanner(System.in).next();
		if (webSite.startsWith("www.")) {
			System.out.println("it starts with www.");
		} else {
			System.out.println("invalid format");
			return;
		}
		System.out.println(webSite.length());
		//diff approch
		//if (url.charAt(url.length()-4)=='.')
		int locationOfDot = webSite.indexOf(".", webSite.indexOf(".") + 1);
		if (locationOfDot > 4 && locationOfDot< webSite.length()-1) {
			System.out.println("it end with dot");

		} else {
			System.out.println("invalid format");
			return;
		}
		String domain = webSite.substring(webSite.indexOf(".") + 1, locationOfDot);
		System.out.println("domain is : " + domain);
		String extention = webSite.substring(locationOfDot + 1,webSite.length()-1);
		System.out.println("extention is : " + extention);

	}
}
