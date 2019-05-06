package day16_String_manipulation;

public class IsEmpty {
	public static void main(String[] args) {
		String userName = "";
		System.out.println(userName.isEmpty());// true
		userName = " ";
		System.out.println(userName.isEmpty());// true
		userName = "";
		if (userName.isEmpty()) {
			System.out.println("User Name can not be empty");
		} else {
			System.out.println("Welcome ibn kalti");
		}
		if (!userName.isEmpty()) {
			System.out.println("Welcome Ibn kalti");
		} else {
			System.out.println("user Name is empty");

		}
		System.out.println(userName.isBlank());

		// diff between empty and blank is white space

		String userName2 = " ";
		System.out.println(userName2.isEmpty());//false
		System.out.println(userName2.isBlank());//true
		
	}

}
