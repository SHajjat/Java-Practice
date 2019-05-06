package day36_WrapperClasses;

public class WrapperClassMethod {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		
		int count = Integer.parseInt("12345");
		Integer count2 = Integer.valueOf("12345");
		System.out.println(count);
		System.out.println(count2);
		
		
		System.out.println(Character.isLetter('j'));
		System.out.println("test " +Character.isLetter('!'));
		System.out.println(Character.isLetter('4'));
		System.out.println(Character.isDigit('5'));
		String str = "java";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit('4'));
		
		
		String word ="abc123dsadas32dasda";
		for (int i = 0 ; i<word.length();i++) {
			if (Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}
		}
		
		
	}

}
