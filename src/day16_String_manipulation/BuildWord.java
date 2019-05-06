package day16_String_manipulation;

public class BuildWord {
	public static void main (String[]args) {
		String chara = "<<>>";
		String word = "yaay";
		String result = chara.substring(0,2)+word+chara.substring(2);
		System.out.println(result);
		result = ""+chara.charAt(0)+chara.charAt(1)+word+chara.charAt(2)+chara.charAt(3);
		System.out.println(result);
		int i = 0;
		while (i<4) {
			if (i==2) {
				System.out.print(word);
			}
			System.out.print(chara.charAt(i));
			i++;
			}
		
		}
	}


