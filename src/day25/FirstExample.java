package day25;

import java.util.Arrays;
import java.util.Random;

public class FirstExample {
	public static void main(String[] args) {
		String[] names = {  "James","Mary",
							"John","Patricia",
							"Robert","Jennifer",
							"Michael","Linda",
							"William","Elizabeth",
							"David","Barbara",
							"Richard","Susan",
							"Joseph","Jessica",
							"Thomas","Sarah",
							"Charles","Margaret",
							"Christopher","Karen",
							"Daniel","Nancy",
							"Matthew","Lisa",
							"Anthony","Betty",
							"Donald","Dorothy",
							"Mark","Sandra",
							"Paul","Ashley",
							"Steven","Kimberly",
							"Andrew","Donna",
							"Kenneth","Emily",
							"George","Carol",
							"Joshua","Michelle",
							"Kevin","Amanda",
							"Brian","Melissa",
							"Edward","Deborah",
							"Ronald","Stephanie",
							"Timothy","Rebecca",
							"Jason","Laura",
							"Jeffrey","Helen",
							"Ryan","Sharon",
							"Jacob","Cynthia",
							"Gary","Kathleen",
							"Nicholas","Amy",
							"Eric","Shirley",
							"Stephen","Angela",
							"Jonathan","Anna",
							"Larry","Ruth",
							"Justin","Brenda",
							"Scott","Pamela",
							"Brandon","Nicole",
							"Frank","Katherine",
							"Benjamin","Samantha",
							"Gregory","Christine",
							"Raymond","Catherine",
							"Samuel","Virginia",
							"Patrick","Debra",
							"Alexander","Rachel",
							"Jack","Janet",
							"Dennis","Emma",
							"Jerry","Carolyn",
							"Tyler","Maria",
							"Aaron","Heather",
							"Henry","Diane",
							"Jose","Julie",
							"Douglas","Joyce",
							"Peter","Evelyn",
							"Adam","Joan",
							"Nathan","Victoria",
							"Zachary","Kelly",
							"Walter","Christina",
							"Kyle","Lauren",
							"Harold","Frances",
							"Carl","Martha",
							"Jeremy","Judith",
							"Gerald","Cheryl",
							"Keith","Megan",
							"Roger","Andrea",
							"Arthur","Olivia",
							"Terry","Ann",
							"Lawrence","Jean",
							"Sean","Alice",
							"Christian","Jacqueline",
							"Ethan","Hannah",
							"Austin","Doris",
							"Joe","Kathryn",
							"Albert","Gloria",
							"Jesse","Teresa",
							"Willie","Sara",
							"Billy","Janice",
							"Bryan","Marie",
							"Bruce","Julia",
							"Noah","Grace",
							"Jordan","Judy",
							"Dylan","Theresa",
							"Ralph","Madison",
							"Roy","Beverly",
							"Alan","Denise",
							"Wayne","Marilyn",
							"Eugene","Amber",
							"Juan","Danielle",
							"Gabriel","Rose",
							"Louis","Brittany",
							"Russell","Diana",
							"Randy","Abigail",
							"Vincent","Natalie",
							"Philip","Jane",
							"Logan","Lori",
							"Bobby","Alexis",
							"Harry","Tiffany",
							"Johnny","Kayla"};
		//Print number of names in the array.
		System.out.println("Total names: " + names.length);
		//print all names in single line
		System.out.println(Arrays.toString(names));
		//Print in column format.
		//2 names in each line.
		//James, Mary
		//John, Patricia
		
		for(int i = 0; i < names.length; i+=2) {
			System.out.println(names[i]+", "+ names[i+1]);
		}
		
		//print male names in single line separated by comma
		System.out.println("MALE NAMES: ");
		for(int m = 0; m < names.length; m+=2) {
			System.out.print(names[m]+", ");
		}
		//print female names in single line separated by comma
		System.out.println("\nFEMALE NAMES:");
		for(int idx = 0; idx < names.length; idx++) {
			if(idx % 2 != 0) {
				if(idx == names.length -1) {
					System.out.print(names[idx]);	
				}else {
					System.out.print(names[idx]+", ");
				}
				
				
			}
		}
		Random rand = new Random() ;
		int r = rand.nextInt(names.length);//random take 0-names.length but doesnt include last number in length
		System.out.println();
		System.out.println("Random Name :" +names[r]);
		int coutn = 0;
		for (String nem : names) {
			if (nem.length()<=4) {
				System.out.print(nem.toUpperCase()+ ", ");
				coutn++;
			}
		}
		System.out.println();
		System.out.println(coutn);
		
		
		String names3to4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		for (String name : names) {
			if (name.length()>= 3 && name.length()<= 4) {
				names3to4+=name+ ", ";
			}else if (name.length()>4 && name.length() <7) {
			names5to6+=name+", ";
			}else if (name.length()>=7) {
				names7orMore+=name+", ";
			}
		}
		System.out.println("names 3 to 4 : "+ names3to4.substring(0,names3to4.length()-2));
		System.out.println("names 5 to 6 : "+ names5to6.substring(0,names5to6.length()-2));
		System.out.println("names 7 or bigger : "+names7orMore.substring(0,names7orMore.length()-2));
		
		
		System.out.println(Arrays.deepToString(names));
		//switch between male and female:
//		String TempName = "";
		for (int i = 0 ; i<names.length-1;i+=2) {
//			TempName=names[i];
//			names[i]=names[i+1];
//			names[i+1]=TempName;
            names[i]+=names[i+1];
            names[i+1]=names[i].substring(0,(names[i].length()-1)-(names[i+1].length()-1));
            names[i]=names[i].substring((names[i+1].length()));
			
		}
		System.out.println("*****");
		
		System.out.println(Arrays.deepToString(names));
		
		
}
}


