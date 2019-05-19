package day27_arrays05;
import java.util.*;

public class CanvasCourses {
	public static void main(String[] args) {
//		147 -> Java programming
//		204 -> Mentoring sessions
//		149 -> SDLC
//		152 -> QA Testing
//		144 -> Team activity
//		143 -> Welcome Kit
//		--> split by "/" and get the last value from array
//		--> convert it to integer. Integer.parseInt(...) -> int value
//		--> switch statement and find the matching
		
		String url = new Scanner (System.in).next();
		
		String urlArray [] = url.split("/");
		int urlNumber = Integer.parseInt(urlArray[urlArray.length-1]);
		int ending []= {147 , 204 , 149 , 152, 144,143};
		String nameEnding []= {"Java programming","Mentoring sessions","SDLC",
				"QA Testing","Team activity","Welcome Kit"};
				
		for (int i = 0 ; i <ending.length;i++) {
			if (ending[i]==urlNumber) {
				System.out.println(nameEnding[i]);
				return;
			}else if (i==ending.length-1) {
				System.out.println("error , your course is not offered");
				
				
			}
		}
		//System.out.println(Arrays1.asList(ending).indexOf(204));
		
		
	}

}
