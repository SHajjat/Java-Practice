package day12_Switch;

public class OrInSwitchStatment {

	public static void main(String[] args) {
		// if grade is A , B or C you pass
		// if grade is D or E you fail
		char grade = 'B';
		switch (grade) {
		case 'A':
		case 'B':
		case'C':
			System.out.println("you passed");
		    break;
		case 'D':
		case 'E':
			System.out.println("you failed");
			break;
		}

	}

}
