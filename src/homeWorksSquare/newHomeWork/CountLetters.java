package homeWorksSquare.newHomeWork;

public class CountLetters {
	public static void main(String[] args) {
		System.out.println(countLetters("aaabbcccc"));
	}
	
	public static String countLetters(String str){
		String result ="there are ",temp=""; int numberOfChars =0;
		while (!str.isEmpty()){
			temp=""+str.charAt(0);
			numberOfChars = str.length() - str.replace(""+str.charAt(0),"").length();
			if(str.isEmpty()){
				result+=" and ";
			}else{
				result+=", ";
			}
			result += numberOfChars+" "+temp+"\'s";
		}
		
		return result;
	}
}
