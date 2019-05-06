package day20;

import java.util.*;

public class WeedDays {

	public static void main(String[] args) {

		for (int i = 1; i <= 8; i++) {
			if (i == 8)
				return;

			switch (i) {

			case 1:
				System.out.println(i + " -monday ");
				break;
			case 2:
				System.out.println(i + "-Tusday ");
				break;

			case 3:
				System.out.println(i + "-Wendenday ");
				break;
			case 4:
				System.out.println(i + "-Thursday ");
				break;
			case 5:
				System.out.println(i + "-Friday ");
				break;
			case 6:
				System.out.println(i + "-Saturday ");
				break;
			case 7:
				System.out.println(i + "-Sunday ");
				break;
			default:
				System.out.println("you dead");

			}

		}

	}
}