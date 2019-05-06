package day27_arrays05;
import java.util.*;
public class NameOfLangs {
	public static void main(String[] args) {
//		Java --> programming language
//		Selenium --> Test Automation
//		TestNG --> Unit Tests
//		JUnit --> Unit Tests
//		Cucumber --> BDD Style testing
//		Git --> Version control
//		Maven --> Building and execution for project
		
		String input = new Scanner (System.in).nextLine();
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		String [] langs = {"programming language","Test Automation","Unit Tests","Unit Tests","BDD Style testing","Version control","Building and execution for project"};
		for (int i = 0 ; i<tools.length;i++) {
			if (input.equalsIgnoreCase(tools[i])) {
				System.out.println(tools[i]+" - "+langs[i]);
				
			}
		}
	}

}
