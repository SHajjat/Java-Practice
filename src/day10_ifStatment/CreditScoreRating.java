package day10_ifStatment;

import java.util.*;

public class CreditScoreRating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Score");
		int myScore = input.nextInt();
		HashMap<String, Integer[]> score = new HashMap<String, Integer[]>();
		score.put("Excellent ", new Integer[] { 850, 760 });
		score.put("Very Good ", new Integer[] { 759, 700 });
		score.put("Good ", new Integer[] { 669, 660 });
		score.put("fair ", new Integer[] { 659, 620 });
		score.put("Poor ", new Integer[] { 619, 580 });
		score.put("Very Bad ", new Integer[] { 579, 0 });
		//score.put("not Valid number" , new Integer[] { ,851});
		//System.out.println(score.size());

		for (String key : score.keySet()) {
			if (myScore <= score.get(key)[0] && myScore >= score.get(key)[1]) {
				System.out.println(key);
			}else if (myScore > score.get("Excellent ")[0] || myScore < score.get("Very Bad ")[1]) {
					System.out.println("out of value");
					break;
			}
		}

		}
	}


// for (Integer i =0 ; i <6 ;i++){

//		  for(String key: score.keySet()) {
//			if (myScore <= score.get(key)[0] &&myScore >= score.get(key)[1] ) {
//				 y = (key);
//				 System.out.println(y);
// }
//		  }
//		 
//		}
//	}
//		

//		int baseScore = 850;
//		int myScore = input.nextInt();
//		for (int i = 0 ; i<=4; i++) {
//			if ( myScore <baseScore && myScore > (baseScore -)
//			
// }

//}
