package day16_String_manipulation;

public class CapitalCity {

	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//Baku , Azerbaijan,
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		int strCout = str.codePointCount(0,str.length()-1);
		System.out.println(strCout);
		String company = "wellsfargo";
		String email = "  samir.hajjat@gmail.com".replace("gmail", company);
		System.out.println(email);
		boolean yes = email.isEmpty();
		System.out.println(yes);
		String balls = email.trim();
		System.out.println(balls);

	}

}
