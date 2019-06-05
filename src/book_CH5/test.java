package book_CH5;

import java.util.Arrays;

public class test {
	//public static void main(String... weather) {
//		System.out.print(weather[0]!=null && weather[0].equals("sunny") && !false
//				? "Go Outside" : "Stay Inside"); }
	//System.out.println(weather.length);
	public static String play(int toy, int age) {
		final String game;
		
		
		if ( toy < 2 ) game = age > 1 ? "1" : "10"; // p
		else
			game = age > 3 ? "Ball" : "Swim"; // p2
		
		return game;
	}
	static int[][] game = new int [4][4];
	
	
		public static void main(String[] args) {
			System.out.println(Arrays.toString(game));
			game[3][3] = 6;
			Object[] obj = game;
			//game[3][3] = "X"; System.out.println(game[3][3]);
			System.out.println(new Integer {1,2,3});
		}
	}
	
	


	
	


