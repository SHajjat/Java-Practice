package day15_StringManupalation;

public class GoogleSearchTool {

	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + "-Google Search";
		//test if pageTitle starts with item
		if (pageTitle.startsWith(item)) {
			System.out.println("Pass : page title check passed");
		}else {
			System.out.println("Fail : page title check failed");
		}if (pageTitle.endsWith("Google Search")) {
			System.out.println("you using google");
		}else {
			
		}
		

	}

}
