package day31_Methods;

import java.util.*;

public class WarmUp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Count up bro !!");
		countUp(new Scanner(System.in).nextInt());
		System.out.println("Count down bro !!");
		countDown(new Scanner(System.in).nextInt());

	}

	/*
	 * Methods : void methods -> does not return value 1)without parameters / arg /
	 * input 2)with one or more params/ args /input
	 */

	public static void countUp(int count) {
		if (count <= 0) {
			System.out.println("Invalid input enter another number other than " + count);
			countUp(new Scanner (System.in).nextInt());
		} else {

			for (int i = 0; i <= count; i++) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void countDown(int count) {
		if (count <= 0) {
			System.out.println("Invalid input enter another number other than "+ count);
			countDown(new Scanner (System.in).nextInt());
		} else {
			for (int i = count; i >= 0; i--) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
