package day27_arrays05;

import java.util.Arrays;

public class SoccorPlayers {
	public static void main(String[] args) {
		String [][] players = new String [2][6];
		players [0][0]="Irina";
		players [0][1] = "Zarif";
		players [0][2] = "Cihan";
		players [0][3] = "Habib";
		players [0][4]= "Adel";
		players [0][5]= "Bojan";
		players [1][0]="Olimjon";
		players [1][1] = "Mirshod";
		players [1][2] = "Usman";
		players [1][3] = "Nursultan";
		players [1][4]= "Roman";
		players [1][5]= "Dmitriy";
		//int max = Integer.MAX_VALUE;
		//System.out.println(max);
		
		System.out.println(players[0][0]);//Irina
		System.out.println(players [0][3]);//Habib
		System.out.println(players[1][5]);//Dmitriy 
		
		//print how many rows , or team
		System.out.println( "how many rows " +players.length);
		System.out.println("how many col "+players[0].length);
		System.out.println(Arrays.deepToString(players));
		System.out.println(Arrays.toString(players[0]));
		
	}

}
