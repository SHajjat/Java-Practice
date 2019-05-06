package day15_StringManupalation;

public class IndexOf02 {

	public static void main(String[] args) {
		String list ="html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println("First Dash : "+ firstDash);
		int secondDash = list.indexOf("-", 5);
		System.out.println("second dash : "+secondDash);
		int ThirdDash = list.indexOf("-", list.indexOf("-", list.indexOf("-")+1)+1);
		System.out.println(ThirdDash);
		//find the last dash
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);

	}

}
