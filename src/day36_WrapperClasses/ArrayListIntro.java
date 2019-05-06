package day36_WrapperClasses;
import java.util.ArrayList;;
public class ArrayListIntro {
	public static void main(String[] args) {
		String [] str = new String [5];
		ArrayList <String> names = new ArrayList <>();
		
		int [] numsArray = new int [5];
		ArrayList <Integer>numsArrayList  = new ArrayList <>();
		
		//how to assign values arraylist
		
		names.add("Roman");
		names.add("Samir");
		names.add("Anna");
		
		
		numsArrayList.add(new Integer ("1"));//for some odd reason it takes int not Integer so only numbers
		System.out.println(names.get(1));
		
		/*
		 * basic ArraList Actions:
		 * 
		 * 1)Create / declare 
		 * 
		 * ArrayList<Integer> nums = new ArrayList<>();
		 * 
		 * 2) assgin / add values to ArrayList
		 * 
		 * nums.add(343); index doesnt need to be specified (index 0)
		 * nums.add(53);
		 * 
		 * 3) read from ArrayList
		 * ==> get(index) method and e need to pass index number
		 */
		
		System.out.println(names.size());
	}

}
