package homeWorks;
import java.util.*;
public class remove {
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n)
	{
		ArrayList<Integer> newR = new ArrayList<>();
		for(int m: r){
			if(m != n){
				newR.add(m);
			}
		}
		return newR;
	}
	
	public static void main(String[] args) {
		ArrayList < Integer> a = new ArrayList<>();
		a.add(1);a.add(2);a.add(3);
		System.out.println(removeInst(a,3));
		
	}
}
