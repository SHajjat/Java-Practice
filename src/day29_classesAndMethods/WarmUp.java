package day29_classesAndMethods;

import java.util.Arrays;

public class WarmUp {
	public static void main(String[] args) {
		String countries [] [] = {
				               {"USA" , "Washington DC"} ,
				               {"Canada" , "Ottawa"},
				               {"Mexico" , "Mexico city"},
				               {"Brasil" , "Brasilia"},
				               {"Peru" , "Lima"},
				               {"Argantina" , "Boanes Aeros"},
				               {"Bolivia" , "La Paz"},
				               {"Macedpnia" , " Scopia"},
				               {"kazakhastan" , "Nursultan"},
				               {"Jordan", "Amman"},
				               };
		String raw ="USA WashingtonDC , Canada Ottawa , Mexico Mexicocity , Brasil Brasilia , Peru Lima , Argentina BoanesAeros , Bolivia LaPaz , Macedonia Scopia , Kazakhstan Nursultan";
		String raw1 []= raw.split(" , ");
		System.out.println(raw1.length);
		String countries2 [][]= new String [9][2];
		for (int i = 0 ; i<raw1.length; i ++) {
		countries2[i]= (raw1[i]).split(" ");	
		}
		//with for loop
		for (int i = 0 ; i <countries2.length ; i ++ ) {
			System.out.print(countries [i][0]+"|");
		}
		System.out.println();
		System.out.println("********");
		//for each loop
		for ( String temp[] : countries2) {
			System.out.print(temp[0]+"|");
		}
		
		System.out.println();
		System.out.println(Arrays.deepToString(countries));
		
		String [] citiesArray = new String [0];
		
		for ( int i = 0 ; i < countries2.length ; i ++) {
			citiesArray = Arrays.copyOf(citiesArray, citiesArray.length+1);
			citiesArray[i]= countries[i][1];
		
		}
		// for empty Array if its String null , int 0 double 0.0
		System.out.println(Arrays.toString(citiesArray));
		String result = "test Failed";
		for (String temp[] : countries ) {
			if (temp[0].equalsIgnoreCase("Bolivia")&& temp[1].equalsIgnoreCase("La Paz")) {
				result = "test passed";
				break;
			}
		}
		System.out.println(result);
		System.out.println(-1%1);
	}
	

}
