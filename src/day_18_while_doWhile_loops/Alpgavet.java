package day_18_while_doWhile_loops;

public class Alpgavet {

	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		while (letter <=('z')) {
		System.out.print(letter+" ");
		letter++;
		//Thread.sleep(100);
		
	}
		System.out.println();
		char capLetter = 'Z';
		while(capLetter >='A') {
			System.out.print(capLetter+ " ");
			capLetter--;
			//Thread.sleep(100);
			
		}
       char letterPeramit = 'A';
       String Alpha = "";
       while (letterPeramit<='Z') {
       Alpha+=letterPeramit;
       System.out.println(Alpha);
       letterPeramit++;
       Thread.sleep(100);
	}
	}

}
