package oca_Quizes;

public class KoalaTester {
	public static void main(String[] args) {
		Koala.main(new String [0]);// thats how you call main method from a differant class
		Koala k = new Koala();
		k.test(10);
		Koala.main(new String [0]);
		//static cant call instant
		
	}
}
