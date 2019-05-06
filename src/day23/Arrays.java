package day23;

public class Arrays {
	public static void main(String[] args) {
		int [] numbers = new int [3];// type int size 3 [0 , 1 , 2]
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		numbers [0]= num1;
		numbers [1]=num2;
		numbers [2]=num3;
		//numbers [1] ='A'; you cant provide diff data types
		for(int i = 0; i<numbers.length;i++)//length is a property of array so no ()
		System.out.println(numbers[i]);
		numbers [0]='a';
		byte [] bytesArray = new byte [400];
		String[] MyString = new String [5];
		
		int[][] myMatrixA = {
				  {3,5,7},
				  {9,17,12},
				  {32,21,5}
				};
		double [] doubleArray =  {1,2,3,4};//declaire and assgin array dont need new double
		System.out.println(doubleArray[0]);
		//for each loop stands for collections of data
		//we need specify data type , variable name : our collection of data
		//for each loop or enhanced loop
		String [] fruits = {"apples", "orange" , "banana"};
		for (String items : fruits) {//for each , 
			System.out.println(items);
		}
	}

}
