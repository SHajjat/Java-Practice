package day39_ArrayList04;
import java.util.*;
public class CustomListMethod {
	public static void printList ( ArrayList<Integer>nums) {
		for (Integer i :nums) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	
	public static Double sumList (List <Double> whatEva) {
		Double sum = 0.0;
		for (Double num :whatEva) {
			sum+=num;
		}
		return sum;
		}
	
	public static ArrayList <Integer> getList(int size){
		ArrayList <Integer> arrList = new ArrayList <>(size);
		for (int i = 1 ; i<=size; i++) {
			arrList.add(i);
		}
		
		return arrList;
		
	}
	
	public static List < Integer> getRandomList(int size){
		Random rand = new Random();
		List <Integer> randomness = new ArrayList<>(size);
		for (int i = 1 ; i<=size;i++) {
		randomness.add(rand.nextInt(67));	
		}
		return randomness;
	}
	
	public static List <Integer> listOFAllLists(List<String> babyList){
		List <Integer> mamaList = new ArrayList<>(babyList.size());
		for (String temp : babyList) {
			mamaList.add(Integer.parseInt(temp));
			// Integer.valueOf("1")
			//new Integer("56")
			
			
		}
		
		return mamaList;
		
	}
	
	
	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);numbers.add(6);numbers.add(7);numbers.add(8);
		printList(numbers);
		
		List <Double> numbers2= new ArrayList <>();
		numbers2.add(1.3);numbers2.add(2.4);numbers2.add(3.4);numbers2.add(4.5);numbers2.add(5.4);numbers2.add(6.03);numbers2.add(7.0);numbers2.add(0.8);
		printList(numbers);
		
		System.out.printf("%4.3f",sumList(numbers2));
		System.out.println();
		System.out.println(getList(6));
		System.out.println(getRandomList(10));
		List <Integer> arr = getRandomList(10);
		System.out.println(arr);
		printList((ArrayList<Integer>) getRandomList(5));
		
		List <String> babyList = new ArrayList<>();
		babyList.add("1");babyList.add("2");babyList.add("3");babyList.add("4");babyList.add("5");
		
		System.out.println(listOFAllLists(babyList));
		
		ArrayList <Integer> myList = new ArrayList<>(Arrays.asList(2,2,3,4,5));
		myList.add(9);
		System.out.println(myList);
	}
	

}
