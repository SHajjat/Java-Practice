package homeWorks;

public class RemoveFirstLetter {
	 public static String removeFirst(String target) {
		    
		    return target.replace(""+target.charAt(0),"");
		    
		  }
	 public static void main(String[] args) {
		System.out.println(removeFirst("aaba"));
	}

}
