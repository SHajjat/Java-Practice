package day45_encapsulation_practice;

public class IsBlankVsIsEmpty {
	public static void main(String[] args) {
		String str = "";
		String str2=" ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
	}
}
