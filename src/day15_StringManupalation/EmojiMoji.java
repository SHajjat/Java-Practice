package day15_StringManupalation;
import java.util.*;
public class EmojiMoji {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how you feeling today brah");
		String emoji =scan.next();
		//String moreEmojis = ""+emoji.charAt(0);
		if (emoji.length() !=2) {
			System.out.println("bro what the hell, you have too much emotions to be here");
			return;
		}
		System.out.flush();
		int case1 = emoji.charAt(0)== ':' ? 1 : (emoji.charAt(0)==':'? 2 : emoji.charAt(0)=='('?3 : 
			emoji.charAt(0)==')'?4 : 5);
		String case2="";
		switch(case1) {
		case 1:
		case2 = emoji.charAt(1)==')'? "smile":emoji.charAt(1)=='('?"sad":
			emoji.charAt(1)=='/'?"upset":emoji.charAt(0)=='P'?"playfull":
				"not valid feeling, you cant even feel bro";
		break;
		case 2:
		case2 = emoji.charAt(1)==')'? "wink":emoji.charAt(1)=='0'?"surpised":
				"not valid feeling, you cant even feel bro";
			break;
		case 3:
		case2="it doesnt matter";
		break;
		case 4 :
		case2= "nothing else matter";
			
			
			break;
		default:
			System.out.println("brah, not a vailid feeling brah");
			return;
		}
			System.out.println("you feeling "+case2);
			
		}
	}


