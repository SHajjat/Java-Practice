package test;

public class DimondLoopConditional {
	public static void main(String[] args) {

		String print = "", star = "*", space = " ", nextLine = "\n";
		int i = 0;
		int j = 0;
		do {
			if (j < 5)
				i++; // going from case 1 to 4
			else if (j > 5)
				i--; // going from case 3 to 1
			else
				i -= 2;
			switch (i) {
			case 1:
				for (int k = 0; k < 3; k++)
					print += space;
				print = print + star + nextLine;
				break;
			case 2:
				for (int k = 0; k < 2; k++)
					print += space;
				for (int k = 0; k < 3; k++)
					print += star;
				print += nextLine;
				break;
			case 3:
				print += space;
				for (int k = 0; k < 5; k++)
					print += star;
				print += nextLine;
				break;
			case 4:
				for (int k = 0; k < 7; k++)
					print += star;
				print += nextLine;
				break;
			}
			j++;
		} while (i >= 0);
		System.out.print(print);
	}

}
