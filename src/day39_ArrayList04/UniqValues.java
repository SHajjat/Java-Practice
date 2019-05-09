package day39_ArrayList04;
import java.util.*;
public class UniqValues {
public static void main(String[] args) {
	List <Integer> nums = new ArrayList <>();
	//nums.add(new Scanner(System.in).nextInt());
	nums.add(10);nums.add(10);nums.add(7);nums.add(8);
	nums.add(8);nums.add(3);nums.add(4);nums.add(8);
	List <Integer> unique1 = new ArrayList<>();
	for (Integer num : nums) {
		//assgin num to unique1 if nums is not already there
		
		if(!unique1.contains(num)){
			unique1.add(num);
		}
	}
	System.out.println(nums);
	System.out.println(unique1);
	
	List <Integer> uniq2= new ArrayList<>();
//	int k = 0;
//	for (int i = 0 ; k<nums.size();i++) {
//		if (nums.get(k)!=nums.get(i) && i!=k && i==nums.size()-1) {
//			uniq2.add(nums.get(k));
//			k++;
//			i=0;
//		}else if ((i==nums.size()-1 ||nums.get(k)==nums.get(i)) &&i!=k){
//			k++;
//			i=0;
//		}
		
//	}
	
	for (int i = 0 ; i<nums.size();i++) {
		if (nums.indexOf(nums.get(i))!=nums.lastIndexOf(nums.get(i))) {
			ArrayList <Integer> dump = new ArrayList<>();
			dump.add(nums.get(i));
			nums.removeAll(dump);
		}
		
		
		
	}
	System.out.println(nums);
	//System.out.println(uniq2);
	
}
	public static void removeALL(ArrayList <String> wordList , String targetWord){
		  ArrayList <String> targetArray = new ArrayList <>();
		  targetArray.add(targetWord);
		   wordList.removeAll(targetArray);
		   
			
		}
	
	
	
	}

