package day27_arrays05;

import java.util.Arrays;

public class NumbersMultiDArray {
	public static void main(String[] args) {
		int [][] numbers = new int [3][4];
		numbers [0][0]= 100;
		numbers [0][1]= 200;
		numbers [0][2]= 300;
		numbers [0][3]= 400;
		
		numbers [1][0]= 110;
		numbers [1][1]= 210;
		numbers [1][2]= 310;
		numbers [1][3]= 410;
		
		
		numbers [2][0]= 120;
		numbers [2][1]= 220;
		numbers [2][2]= 320;
		numbers [2][3]= 420;
		
		
		System.out.println(Arrays.deepToString(numbers));
		
		
		int [][] scores = { { 3,5,10} , {6,4,2,10,12,15} };
		int [][][] manyakeh = { { {2,3,5} , {234,2} } , { {2,3,5} , {234,2} } , { {2,3,5} , {234,2} }};
		System.out.println(Arrays.deepToString(scores));
		System.out.println(Arrays.deepToString(manyakeh));
		System.out.println("number of days :"+scores.length);
		System.out.println("number of Values in 1 : "+ scores[0].length);
		System.out.println("number of values in 2 : " + scores[1].length);
		
		
		int [][] values = new int [4][];//i know how many arrays but dont know how many values in the inner array
		values[0]= new int [] { 1, 33 ,5}; // it has to be new Type []
		values [1] = new int [] { 342432, 432432, 432432, 423423, 54534,546456};
		values [2]= new int [2];// the values assigned are {0 , 0 , 0}
		values [2][0]= 1;
		values [2][1]= -3;
		values [3]= new int [] { 1,2,3,4,5};
		
		for (int i = 0 ; i < values.length ; i++) {
			System.out.println("length of Array " + (i+1 )+ " is "+ values[i].length);
			
		}
		System.out.println(Arrays.deepToString(values));
		
	}

}
