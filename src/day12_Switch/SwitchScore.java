package day12_Switch;

public class SwitchScore {

	public static void main(String[] args) {
		int score = 4 ;
		//if score is 1 , print msg
		//if score is 2 , print other msg
		switch ( score) {
		case 1 : 
			System.out.println("you scored 1 goals");
			break;//exit switch statment
		case 2 : 
			System.out.println("you scored 2 goals");
			break;
		case (6-3) :
			System.out.println("5ala9 7el 3ani ya zam");
			break;
		default:
			System.out.println("invalid Score");
			break; //works without break but to keep consistant 
		}
	}

}
