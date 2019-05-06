package homeWorks;

import java.util.*;

public class ZombieAttack2 {
	public static void main(String[] args) {
//		// [3, 6, 0, 4, 3, 2, 7, 0]
//		int inhabitants[] = { 3, 6, 0, 4, 3, 2, 7, 0 };
//		// inhabitantsTemp[]={ 0,10, 0, 20, 4, 0, 1, 6, 0
//		int inhabitantsTemp[] = new int[inhabitants.length + 2];
//		Arrays.fill(inhabitantsTemp, 1);
//		// System.out.println(Arrays.toString(inhabitantsTemp));
//		int i = 0, sum;
//		do {
//			Arrays.fill(inhabitantsTemp, 1);
//			System.out.println("Day " + i++ + " " + Arrays.toString(inhabitants));
//			sum = 0;
//			for (int k = 0; k < inhabitants.length; k++) {
//				switch (inhabitants[k]) {
//				case 0:
//					inhabitantsTemp[k] = 2;
//					inhabitantsTemp[k + 2] = 2;
//					break;
//				}
//
//			}
//			for (int j = 0; j < inhabitants.length; j++) {
//				inhabitants[j] /= inhabitantsTemp[j + 1];
//				sum += inhabitants[j];
//			}
//			
//		} while (sum > 0);
//		System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
//
//		System.out.println("---- EXTINCT ----");
		
		int[] inhabitants = { 1, 10, 0, 4, 0, 1, 6, 0 };
        int[] inh2 = new int[inhabitants.length];
        int day =0;
        System.out.println("Day "+day+++" "+Arrays.toString(inhabitants));
        while (!Arrays.equals(inhabitants, inh2)) {
            for (int i = 0; i < inhabitants.length - 1; i++) {
                if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                    inhabitants[i]  /= 2;
                } else if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
                    inhabitants[i + 1] /= 2;
                    i++;
                }
            }
            System.out.println("Day "+day+++" "+Arrays.toString(inhabitants));
        }
        System.out.println("---- EXTINCT ----");

	}
}
