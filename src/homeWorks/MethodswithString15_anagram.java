package homeWorks;

public class MethodswithString15_anagram {
	 public static boolean isAnagram(String word1, String word2) {
		    word1 = word1.toLowerCase();word2 = word2.toLowerCase();
		    for(int i = 0 ; i <word1.length();i++){
		      if(word1.replace(""+word1.charAt(i),"").length()!=word2.replace(""+word1.charAt(i),"").length()){
		        return false;
		      }
		    }
		    return true;
		  }

}
