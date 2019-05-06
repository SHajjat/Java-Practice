package day08_casting_conditional;
import java.util.*;
public class GradeCheck {
	public static void main(String[] args) {
		
		//A , B , C , D
		//char grade = scan.next().char(0);
		//if grade'A' ==> Excellent job! keep it up!
		//else if 'B'
		//
		char A = 'A', B='B', C= 'C', D = 'D';
		char grade = new Scanner(System.in).next().charAt(0);
		if (grade == A)
			System.out.println("Excellent job! keep it up!");
		else {
			System.out.println("how many points did you miss for an A");
			
		}
		
		
	}

}
