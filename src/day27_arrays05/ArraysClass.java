package day27_arrays05;
import java.util.*;
public class ArraysClass {
public static void main(String[] args) {
	int [] nums = {43 , 12 , 4 , 5 , 333};
	
	
	//toString Method
	int [][] numbers = { { 1,2,3}, {5,6,7}};
	String numsString =Arrays.toString(nums);
	System.out.println(Arrays.toString(nums));
	System.out.println(numsString);
	System.out.println(Arrays.deepToString(numbers));//to convert multidimensional Arrays
	
	
	//sort
	String [] languages = {"Zulu" , "Arabic" , "English", "Italian"};
	System.out.println(Arrays.toString(languages));
	System.out.println(Arrays.binarySearch(languages,"Arabic"));
	Arrays.sort(languages);//it takes the old array sort it and change the old array
	System.out.println(Arrays.toString(languages));
	
	int [] nums2 = {345 , 665 , 3333, 11,3,66};
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));
	int lowest = nums2[0];
	int largest = nums2[nums2.length-1];
	System.out.println("lowest number :"+lowest+ " \nlargest number :"+largest);
	
	//BinarySearch ==> its like indexOf
	
	int nums3 [ ] = {4,7,7,10,55};
	System.out.println(Arrays.binarySearch(nums3, 7));
	System.out.println(Arrays.binarySearch(nums3, 55));
	
	int nums4 []= {40, 6 , 17,10,55};
	System.out.println(Arrays.binarySearch(nums4, 10));//it need to be sorted
	
	
	//Equals method compares two arrays and return true if the are the same and return false if they are not
	
	int [] arr1 = {3,5,6};
	int []arr2 = {3,6,5};//location sensative 
	Arrays.equals(arr1,arr2);
	System.out.println(Arrays.equals(arr1,arr2));
	
	String [] names1 = {"ahmad", "esa" ,"mohammad"};
	String [] names2 = {"ahmad" , "Esa" , "mohammad"};
	System.out.println(Arrays.equals(names1, names2));
	//Arrays.equals((arr2), names2); cant compare String to int
	
	
	//copyOf to copy a Array of part of it
	
	double [] d1 = {2.3 , 4.5 , 12.4};
	double [] d2 = d1;//assigning d2 to d1;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	d1[0]=1000.3;
	
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	d2[1]=5000.4;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	
	double d3 [] = Arrays.copyOf(d2, d2.length);
	d2[2]=123.4;
	System.out.println(Arrays.toString(d1));
	System.out.println(Arrays.toString(d2));
	System.out.println(Arrays.toString(d3));//After copying its independent 
	//1)Benefits , you can copy one array to another without pointing to the same object
	
	int [] nums7 = {24 , 36 , 23 ,1 ,55};
	int [] nums8 = Arrays.copyOf(nums7, 3);//if you give it smaller length its gonna take up to the length
	System.out.println(Arrays.toString(nums7));
	System.out.println(Arrays.toString(nums8));
	 nums8 = Arrays.copyOf(nums7, nums7.length+3);//if you give it smaller length its gonna take up to the length
	System.out.println(Arrays.toString(nums7));
	System.out.println(Arrays.toString(nums8));
	nums8[nums8.length-1]=100;
	System.out.println(Arrays.toString(nums7));
	System.out.println(Arrays.toString(nums8));
	
	int [] nums9 = Arrays.copyOfRange(nums7, 2,4 );//it takes index of 2 and doesnt take 4 like substring
	System.out.println(Arrays.toString(nums9));
	
	
	int [] brandNew = {34 , 23 , 54, 23};
	System.out.println("Length before " +brandNew.length);
	brandNew = Arrays.copyOf(brandNew, brandNew.length+1);
	System.out.println("Length after " +brandNew.length);
	
	
	}
	
	
	
}

