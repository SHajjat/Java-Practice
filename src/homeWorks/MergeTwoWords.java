package homeWorks;

public class MergeTwoWords {
	 public static String mergeStrings(String one, String two) {
		    
		 String str = "";
		    while (one.length()>0 && two.length()>0){
		      
		      str+=""+one.charAt(0)+two.charAt(0);
		     one = one.replace(""+one.charAt(0), "");
		    two =  two.replace(""+two.charAt(0), "");
		    }
		    str+=one+two;
		    return str;
		    
		  }
	 
	 public static void main(String[] args) {
		System.out.println(mergeStrings("1234", "abcde"));
	}

}
