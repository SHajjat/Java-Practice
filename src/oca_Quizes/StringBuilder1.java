package oca_Quizes;

public class StringBuilder1 {
	public static void main(String[] args) {
		StringBuilder alpha = new StringBuilder();
		for (char current = 'a';current<='z';current++){
			alpha.append(current);
		}
		System.out.println(alpha);
		
		StringBuilder beta = new StringBuilder("Samir");
		beta.append(" Hajjat");
		System.out.println(beta.append("a").append("b").append('b'));
		System.out.println(beta.indexOf(" "));
		System.out.println(beta.compareTo(alpha));
		System.out.println(beta.compareTo(new StringBuilder("Samir Hafjaq")));
		System.out.println(beta.equals(alpha));
		System.out.println(beta.toString().equalsIgnoreCase(alpha.toString()));
		 StringBuilder gamma = new StringBuilder();
		 gamma.append("Bryan",1,5).replace(0,1,"R");
		System.out.println(gamma);
		System.out.println(beta);
		gamma = beta.append(1);
		System.out.println(beta);
		System.out.println(gamma);
		beta.append(2);
		System.out.println(gamma);
		beta = new StringBuilder(gamma);//
		System.out.println(gamma.append(1));
		System.out.println(beta);
		System.out.println(new StringBuilder());
		System.out.println("*******");
		System.out.println(beta);
		beta.substring(1,3);
		System.out.println(beta);
		
	}
}
