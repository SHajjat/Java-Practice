package day23;

public class PrintWord {
	public static void main(String[] args) {
		String str = "java";
		for (int i = 0 ; i<str.length()-1; i++) {
			if (str.substring(i,i+1).equals("a")) {
			continue;
			}
			System.out.print(str.substring(i,i+1));
		}
	}

}
