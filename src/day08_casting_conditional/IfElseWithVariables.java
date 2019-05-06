package day08_casting_conditional;
import java.util.*;
public class IfElseWithVariables {
public static void main(String[] args) {
	int temperature = 65;
	if (temperature>=65) {
		System.out.println("its a nice day ");
		
	}else {
		System.out.println("get the fuck out");
	}//2 int variables ,teamAScore , teamBScore
	//put condition . check if teamA won. "team A won".
	//else "team b won or it was a draw
	Scanner input = new Scanner (System.in);
	System.out.println("Enter how many goal Team A entered");
	int teamAscore = input.nextInt();
	System.out.println("Enter how many goals Team B Scored");
	int teamBScore = input.nextInt();
	if (teamAscore> teamBScore) 
		System.out.println("Team A won");
	else if (teamBScore>teamAscore) 
		System.out.println("Team B Won");
	else
		System.out.println("It is a draw");
		
	}
	
	
		

}
