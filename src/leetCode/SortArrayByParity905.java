package leetCode;

import day37_ArrayList.ArraysAsList;

public class SortArrayByParity905 {
	public static int[] sortArrayByParity(int[] A) {
		int [] sorted = new int [A.length];
		int k = A.length-1;
		for (int i = 0 ; i<A.length ;i++) {
			if ( A[i] % 2 == 0 ) {
				sorted[i] = A[i];
			} else {
				sorted[k--] = A[i];
			}
		}
		return sorted;
		
	}
	
	public static void main(String[] args) {
		int  [] A = {1,2,3,4};
		sortArrayByParity(A);
	}
}
