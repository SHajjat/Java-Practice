package day31_Methods;

public class Authentication {
	public static void login(String userName, String passWrod) {
		String user = "mentor001", pass = "mentoring@cybertek";
		String answer = userName.equals(user)? passWrod.equals(pass) ?"Welcome ibn el khal":"sign in failed"  :"sign in failed";
		System.out.println(answer);

	}

	public static void main(String[] args) {
		login("mentor001", "mentoring@cybertek");
	}

}
